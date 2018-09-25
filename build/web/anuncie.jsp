<%-- 
    Document   : anuncie
    Created on : 24/09/2018, 21:42:44
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
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navBar.jsp" %>
        <div class="container">
            <div class="carousel carousel-slider center">
                <div class="carousel-item red white-text" id="casasBanner"  href="#one!">
                  <h2>Casas!</h2>
                  <p class="white-text" >Anuncie casas para todo o Brasil...</p>
                </div>
                <div class="carousel-item amber white-text" href="#two!" id="outrosBanner">
                  <h2>Outros!</h2>
                  <p class="white-text">Anuncie sua chácara, sítio e muito mais...</p>
                </div>
                <div class="carousel-item green white-text" href="#three!" id="apartamentosBanner">
                  <h2>Apartamentos!</h2>
                  <p class="white-text">Anuncie apartamentos para todo o Brasil...</p>
                </div>
            </div>
        </div>
        <section class="container">
            <h4>
                Anuncie agora!
            </h4>
            <div class="row">
            <hr class="off-setLeft col s1 hrColor">
            </div>
        <div class="row">
          <form class="col s12">
            <div class="row">
              <div class="input-field col s6">
                <input placeholder="Placeholder" id="first_name" type="text" class="validate">
                <label for="first_name">First Name</label>
              </div>
              <div class="input-field col s6">
                <input id="last_name" type="text" class="validate">
                <label for="last_name">Last Name</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input disabled value="I am not editable" id="disabled" type="text" class="validate">
                <label for="disabled">Disabled</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input id="password" type="password" class="validate">
                <label for="password">Password</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input id="email" type="email" class="validate">
                <label for="email">Email</label>
              </div>
            </div>
            <div class="row">
              <div class="col s12">
                This is an inline input field:
                <div class="input-field inline">
                  <input id="email_inline" type="email" class="validate">
                  <label for="email_inline">Email</label>
                  <span class="helper-text" data-error="wrong" data-success="right">Helper text</span>
                </div>
              </div>
            </div>
          </form>
        </div>
        </section>
        <%@include file="footer.jsp" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="Assets/js/materialize.js"></script>
        <script> 
          $(document).ready(function(){
             $('.carousel').carousel();
         });
           $('.carousel.carousel-slider').carousel({
            fullWidth: true,
            indicators: true
          });
        </script>
    </body>
</html>
