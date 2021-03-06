package Sample;
import java.util.Iterator;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchServlet extends HttpServlet {

    int pi = 0;
    String userstr = null;
    public static Set<String> filenameset = new HashSet<String>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        String userID = session.getAttribute("user_id").toString();
        System.out.println("@@@@" + userID);
        userstr = request.getParameter("search");

        session.setAttribute("keyw", userstr);

        System.out.println("fffffffffffffffffffff" + userstr);
        String[] str1 = userstr.split(",");

        boolean found = false;

        findObjectBond(str1, found);


System.out.print("#############################"+filenameset);
        session.setAttribute("user_id", userID);
        RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/Download.jsp");
        rd.forward(request, response);

    }

    public void findObjectBond(String[] str1, boolean found) {
        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select pi from keywords where keyword =  '" + userstr + "'");
            while (rs.next()) {
                pi = Integer.parseInt(rs.getString("pi"));
            }
            
            pi += 1;
            System.out.println("----------------" + pi);

            stmt.executeUpdate("UPDATE keywords SET pi = '" + pi + "' WHERE keyword =  '" + userstr + "'");
            rs = stmt.executeQuery("Select * from learningobjects");

            HashMap<String, Integer> hm = new HashMap<String, Integer>();

            int rowcount = 0;

            Set<String> uniqueKeywords = new HashSet<String>();

            HashMap<String, String> filekw = new HashMap<String, String>();

            while (rs.next()) {
                String str = rs.getString(2);

                String filename = rs.getString(1);

                String[] keywords = str.split(",");

                filekw.put(str, filename);

                for (int i = 0; i < keywords.length; i++) {

                    for (int j = 0; j < str1.length; j++) {
                        if (!hm.containsKey(keywords[i]) && keywords[i].equals(str1[j])) {
                            hm.put(keywords[i], 1);
                            if (!found) {
                                found = true;
                                rowcount++;
                                for (int k = 0; k < keywords.length; k++) {
                                    uniqueKeywords.add(keywords[k]);
                                }
                            }
                        } else if (hm.containsKey(keywords[i]) && keywords[i].equals(str1[j])) {
                            hm.put(keywords[i], hm.get(keywords[i]) + 1);
                            if (!found) {
                                found = true;
                                rowcount++;
                                for (int k = 0; k < keywords.length; k++) {
                                    uniqueKeywords.add(keywords[k]);
                                }
                            }
                        }
                    }

                }
                found = false;
            }

            // Finding the Energy Factor of Each Keyword

            List<Tuple> al = new ArrayList<Tuple>();

            HashMap<String, Float> ef = new HashMap<String, Float>();

            for (Map.Entry<String, Integer> entry : hm.entrySet()) {

                float count = (float) entry.getValue() / rowcount;

                System.out.println("Energy factor of Keyword " + entry.getKey() + " is " + count);

                ef.put(entry.getKey(), count);

                al.add(new Tuple(entry.getKey(), entry.getValue()));
            }

            for (String str : uniqueKeywords) {
                if (!hm.containsKey(str)) {
                    al.add(new Tuple(str, 0));
                    ef.put(str, (float) 0);
                }
            }

            Collections.sort(al, Collections.reverseOrder());
            System.out.println(al);

            rs.beforeFirst();

            HashMap<Object, int[]> microattrhm = new HashMap<Object, int[]>();

            while (rs.next()) {
                String str = rs.getString(2);

                String[] keywords = str.split(",");

                Set<String> addKeywords = new HashSet<String>();

                for (int i = 0; i < keywords.length; i++) {
                    addKeywords.add(keywords[i]);
                }

                int[] arr = new int[uniqueKeywords.size()];
                for (int j = 0; j < al.size(); j++) {
                    Tuple t = al.get(j);
                    {

                        if (addKeywords.contains(t.word)) {
                            arr[j] = 1;
                        } else {
                            arr[j] = 0;
                        }
                    }

                }
                if (!microattrhm.containsKey(rs.getObject(2))) {
                    microattrhm.put(rs.getObject(2), arr);
                }
            }

            System.out.println(microattrhm);

            Iterator it = microattrhm.entrySet().iterator();

            int[] arr1 = new int[al.size()];

            int[] arr2 = new int[al.size()];

            String[][] BondingForces = new String[microattrhm.size()][microattrhm.size()];

            int m = 0, n = 0;

            String maxcovalentbondpair = "";

            String maxionicbondpair = "";

            float max_covalentbond = 0;

            float max_ionicbond = 0;

            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();

                Iterator it1 = microattrhm.entrySet().iterator();

                while (it1.hasNext()) {
                    Map.Entry pair1 = (Map.Entry) it1.next();

                    float covalent_bond = 0;

                    float ionic_bond = 0;

                    if (pair.getKey() == pair1.getKey()) {
                        covalent_bond = -1;
                        ionic_bond = -1;
                    } else {
                        arr1 = (int[]) pair.getValue();

                        arr2 = (int[]) pair1.getValue();

                        for (int i = 0; i < al.size(); i++) {
                            Tuple t1 = al.get(i);

                            if (arr1[i] == arr2[i] && arr1[i] == 1) {
                                covalent_bond += ef.get(t1.word);
                            } else if (arr1[i] != arr2[i]) {
                                if (arr1[i] == 1) {
                                    ionic_bond += ef.get(t1.word);
                                } else if (arr2[i] == 1) {
                                    ionic_bond += ef.get(t1.word);
                                }
                            }
                        }

                    }

                    if (covalent_bond > max_covalentbond) {
                        max_covalentbond = covalent_bond;
                        maxcovalentbondpair = pair.getKey() + " and " + pair1.getKey();
                    }

                    if (ionic_bond > max_ionicbond) {
                        max_ionicbond = ionic_bond;
                        maxionicbondpair = pair.getKey() + "and" + pair1.getKey();
                    }

                    BondingForces[m][n] = "Bonding Force between " + pair.getKey() + " and " + pair1.getKey() + " is "
                            + "(" + covalent_bond + "," + ionic_bond + ")";

                    if (m < microattrhm.size() - 1) {
                        m++;
                    } else {
                        m = 0;
                    }
                }
                if (n < microattrhm.size() - 1) {
                    n++;
                } else {
                    n = 0;
                }
            }

            for (int i = 0; i < microattrhm.size(); i++) {
                for (int j = 0; j < microattrhm.size(); j++) {
                    System.out.println(BondingForces[i][j]);
                }
            }

            System.out.println(max_ionicbond + " between " + maxcovalentbondpair);
            System.out.println(max_covalentbond + " between " + maxionicbondpair);

            if(maxcovalentbondpair != "") {
            	String[] kwsplit = maxcovalentbondpair.split("and");
            	Iterator iter = filekw.entrySet().iterator();
                
                
                int count = 0;
                while (iter.hasNext()) {
                    System.out.println(count++);
                    Map.Entry pairs = (Map.Entry)iter.next();
                    String key = (String) pairs.getKey();
                    String value = (String) pairs.getValue();
                    if (key.trim().equals(kwsplit[0].trim()) || key.trim().equals(kwsplit[1].trim())) {
                    	 System.out.println("=================================================");
                        filenameset.add(value);
                    }
                }

            }
            else if(maxionicbondpair != "") {
            	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            	String[] kwsplit1 = maxionicbondpair.split("and");
            	Iterator iter2 = filekw.entrySet().iterator();
                while (iter2.hasNext()) {
                    Map.Entry pairs1 = (Map.Entry) iter2.next();
                    String key = (String) pairs1.getKey();

                    String value = (String) pairs1.getValue();

                    if (key.trim().equals(kwsplit1[0].trim()) || key.trim().equals(kwsplit1[1].trim())) {
                    	System.out.println("=================================================");
                        filenameset.add(value);
                    }
                }
            }


            

            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
