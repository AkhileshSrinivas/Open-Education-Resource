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

        </style>

        <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.css">

    </head>
    <body>



        <!--Home page style-->
    <header id="home" class="home">
        <div class="overlay-fluid-block">
            <div class="container text-center">
                <div class="row">
                    <div class="home-wrapper">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="home-content">








                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>







    <center>

        <pre><a href="request.jsp">Check Request</a>        <a href="index.html">Logout</a> </pre>


    </center>

    <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
    <script src="assets/js/vendor/bootstrap.min.js"></script>

    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/modernizr.js"></script>
    <script src="assets/js/main.js"></script>















    <script src="js/index.js"></script>









    <script type="text/javascript" src="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.min.js"></script>











</body>
</html>