<%-- 
    Document   : cadastro
    Created on : 23/09/2018, 20:16:33
    Author     : Vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="Assets/geral.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navBar.jsp" %>
        <div class="container">
        <nav class="verdeClaro">
              <div class="nav-wrapper">
                <div class="col s12">
                  <a href="index.jsp" class="breadcrumb">Home</a>
                  <a href="#!" class="breadcrumb">Login</a>
                  <a href="#!" class="breadcrumb">Cadastro</a>
                </div>
              </div>
            </nav>
        </div>
        <section class="container">
            <div class="row">
                <div class="col s12 m6 l6">
                    <h4>Cadastre-se</h4>
                     <div class="row">
                        <div class="input-field col s6">
                          <input id="nome" type="text" class="validate">
                          <label for="nome">Nome</label>
                        </div>
                        <div class="input-field col s6">
                          <input id="sobrenome" type="text" class="validate">
                          <label for="sobrenome">Sobrenome</label>
                        </div>
                         <div class="input-field col s12">
                            <input id="email" type="email" class="validate">
                            <label for="email">Email</label>
                        </div>
                         <div class="input-field col s12 m6">
                             <input id="tel" type="tel" class="validate">
                            <label for="tel">Telefone - (xx)xxxxx-xxxx</label>
                        </div>
                         <div class="input-field col s12 m6">
                             <input id="senha" type="password" class="validate">
                            <label for="senha">Senha</label>
                        </div>
                         <div class="input-field col s12 m6 right">
                             <button class="btn waves-effect waves-light verdeClaro " type="submit" name="action">Submit
                                <i class="material-icons right">send</i>
                            </button>
                        </div>
                        <div class="input-field col s12 m6 left">
                            <p class="pdLeft"><a href="login.jsp">Já possui Cadastro?</a></p>
                        </div>
                     </div>
                </div>
                <div class="col s12 m6 l6 map">
                    <h5>Encontre seu lar, em qualquer lugar!</h5>
                    <div class="row">
                        <div class="col s2">
                            <hr>
                        </div>
                    </div>
                    <iframe class="img-responsive" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3656.558125602592!2d-46.583107785628684!3d-23.584308468323886!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce5c1371effd07%3A0x6d071c630bdd4f16!2sUninove+-+Vila+Prudente!5e0!3m2!1sen!2sbr!4v1537746020902" width="400" height="250" frameborder="0" style="border:0" allowfullscreen></iframe>
                    
                </div>
            </div>
        </section>
        <script src="Assets/js/materialize.js"></script>
    </body>
</html>
