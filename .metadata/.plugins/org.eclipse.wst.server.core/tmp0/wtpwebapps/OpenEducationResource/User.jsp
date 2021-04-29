<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Login Form</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->


        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/plugins.css" />
        <link rel="stylesheet" href="assets/css/roboto-webfont.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>


        <script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
        <script src="JS/autocomplete-0.3.0.min.js"></script>


        <script language="javascript">

            $("#keyword").keypress(function ()
            {
                debugger;
                autocomplete("list.jsp");
            });
        </script>



        <style>

            .az
            {

                
                bottom:-100%;
                border: 2px solid black;
                background-color: grey;
            }




        </style>






        <style>
            input[type="text"] {
                background: rgba(255, 255, 255, 0.1);
                border: none;
                font-size: 16px;
                height: auto;
                margin: 0;
                outline: 0;
                padding: 15px;
                width: 100%;
                background-color: #e8eeef;
                color: #8a97a0;
                box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
                margin-bottom: 30px;
            }

            submit {
                padding: 19px 39px 18px 39px;
                color: #FFF;
                background-color: #4bc970;
                font-size: 18px;
                text-align: center;
                font-style: normal;
                border-radius: 5px;
                width: 100%;
                border: 1px solid #3ac162;
                border-width: 1px 1px 3px;
                box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
                margin-bottom: 10px;
            }

            .autocomplete
            {
                padding: 19px 39px 8px 39px;
                color: #FFF;
                background-color: #4bc970;
                font-size: 18px;
                text-align: center;
                font-style: normal;
                border-radius: 5px;
                width: 200%;
                border: 1px solid #3ac162;
                border-width: 1px 1px 3px;
                box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
                margin-bottom: 10px;
            }

        </style>

        <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.css">

    </head>
    <body>

        <%
            String userID = request.getAttribute("userName").toString();
            System.out.println("User ID = " + userID);
            session.setAttribute("user_id", userID);
        %>

        <%

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningframework", "root", "rootqwer");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select keyword from keywords ORDER BY pi ASC");

            List li = new ArrayList();

            while (rs.next()) {
                li.add(rs.getString(1));
            }

        %>



        <%
            ArrayList ad = new ArrayList();
            ResultSet rs1 = stmt.executeQuery("Select keyword from keywords ORDER BY pi desc");
            while (rs1.next()) {
                ad.add(rs1.getString("keyword"));

                System.out.println(rs1.getString("keyword"));
            }



        %>
        <script type="text/javascript">
        
            function next_page_dj(){
           
                var sp=document.getElementById("spid").value;
              
                window.location="next?cpage=LEDRiser&vendor="+vendor+"&cp="+cp+"&sp="+sp+"&profit="+profit+"&quantity="+c;
           
            }
        
        
            function cal(){
            
                var sp=document.getElementById("spid").value;
                var profit=sp;
            
                document.getElementById("profitid").value=profit;
            }
        
            function check(){
            
       
                alert(c);
            
            
            }
        
        
        </script>
        <!--Home page style-->
    <header id="home" class="home">
        <div class="overlay-fluid-block">
            <div class="container text-center">
                <div class="row">
                    <div class="home-wrapper">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="home-content">


                                
<div class="az">
                                       
                                        <table style="color:black" align="center" cellpadding="40px">


<form action="SearchServlet" method="post">
    <tr>
                                                    <td> Most Searched Keywords
                                                        <select style="color:black" name="search" id="spid">
                                            <%
                                                for (int i = 0; i < 16; i++) {

                                            %>

                                            
                                            <option value="<%=ad.get(i)%>"><%=ad.get(i)%> </option>     
                                                        
       
                                                    <!--                                                    <td>  <input  type="submit" value="search" style="color:black">-->

                                                    
                                           




                                            <%
                                                }

                                            %>
                                                        </select>
                                            </td>


                                             
 </form>
                                                        <form action="SearchServlet" method="post">
                                        
                                                            <td> <h3 style="color:blue">Search File :</h3></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="autocomplete" id="profitid" type="text" name="search" onclick="return cal();"> 
                                        <input
                                            type="submit" value="search" onclick="return next_page_dj();" /></td>
                                           </tr>
                                        
                                    </form>
                                        </table>

                                    
                                    
                                    

                                </div>





                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>









    <div class="scrollup">
        <a href="#"><i class="fa fa-chevron-up"></i></a>
    </div>


    <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
    <script src="assets/js/vendor/bootstrap.min.js"></script>

    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/modernizr.js"></script>
    <script src="assets/js/main.js"></script>















    <script src="js/index.js"></script>









    <script type="text/javascript" src="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.min.js"></script>




    <script type="text/javascript">
      
        var input = document.getElementById("keyword");
      
        var awesomplete = new Awesomplete(input , {list:"<%=li%>"});
         
    </script>






</body>
</html>