<%-- 
    Document   : login
    Created on : 23/09/2018, 17:15:50
    Author     : Vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="Assets/geral.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Efetue login para anúnciar!</title>
    </head>
    <body>
        <%@include file="navBar.jsp" %>
        <div class="container">    
            <nav class="verdeClaro">
              <div class="nav-wrapper">
                <div class="col s12">
                  <a href="#!" class="breadcrumb">Home</a>
                  <a href="#!" class="breadcrumb">Login</a>
                </div>
              </div>
            </nav>
            <div class="center-align">
                <div class="boxLogin z-depth-5 center-align">
                    <h6><strong>Efetue login para anunciar!</strong></h6>
                    <img src="Assets/userDeafult.png" alt="" class="circle limitWidth">
                    <div class="row">
                        <form class="col s12">
                            <div class="row">
                                <div class="input-field col s12">
                                  <input id="email" type="email" class="validate">
                                  <label for="email">Email</label>
                                </div>
                            </div>
                             <div class="row">
                                <div class="input-field col s12">
                                  <input id="senha" type="email" class="validate">
                                  <label for="senha">Senha</label>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="Assets/js/materialize.js"></script>
    </body>
</html>
