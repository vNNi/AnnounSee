<%-- 
    Document   : index
    Created on : 23/09/2018, 14:21:10
    Author     : Vinic
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AnnounSee - Seu próximo lar, em um click!</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="Assets/geral.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body class="">
        <%@include file="navBar.jsp" %>
        <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro" id="fixedbutton" href="#"><i class="material-icons">arrow_drop_up</i></a>
        <div class="banner valign-wrapper">
                <div class="center-align container fundoBanner">
                    <h3 class="resetMargin"> Seu novo lar, em um clique!</h3>
                    <a class="waves-effect waves-light btn-large verdeEscuro">ANUNCIE</a>
                </div>
        </div>
        <section class="container">
            <h4>Apartamentos</h4>
                <div class="row">
                    <hr class="col s1 hrColor">
                    <br>
                    <div class="col s6 m4">
                        <div class="card">
                          <div class="card-image">
                            <img src="images/sample-1.jpg">
                            <span class="card-title">Card Title</span>
                            <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro"><i class="material-icons">add</i></a>
                          </div>
                          <div class="card-content">
                            <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                          </div>
                        </div>
                    </div>
                </div>
            <div class="center-align">
                    <a class="waves-effect waves-light btn-small verdeEscuro">Continue vendo</a>
            </div>
        </section>
        <section class="container">
            <h4>Casas</h4>
            <div class="row">
                <hr class="col s1 hrColor">
                <br>
                <div class="col s6 m4">
                    <div class="card">
                      <div class="card-image">
                        <img src="images/sample-1.jpg">
                        <span class="card-title">Card Title</span>
                        <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro"><i class="material-icons">add</i></a>
                      </div>
                      <div class="card-content">
                        <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                      </div>
                    </div>
                </div>
            </div>
            <div class="center-align">
                    <a class="waves-effect waves-light btn-small verdeEscuro">Continue vendo</a>
            </div>
        </section>
        <section class="container">
            <h4>Outros</h4>
            <div class="row">
                <hr class="col s1 hrColor">
                <br>
                <div class="col s6 m4">
                    <div class="card">
                      <div class="card-image">
                        <img src="images/sample-1.jpg">
                        <span class="card-title">Card Title</span>
                        <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro"><i class="material-icons">add</i></a>
                      </div>
                      <div class="card-content">
                        <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                      </div>
                    </div>
                </div>
            </div>
            <div class="center-align">
                <a class="waves-effect waves-light btn-small verdeEscuro">Continue vendo</a>
            </div>
        </section>
        <section class="container">
            <h4>Galeria</h4>
            <div class="row">
            <hr class="off-setLeft col s1 hrColor">
            </div>
          <div class="carousel">
                <a class="carousel-item" href="#one!" id="imgIndex"><img src="Assets/casa1.jpg"></a>
                <a class="carousel-item" href="#two!" id="imgIndex"><img src="Assets/casa1.jpg"></a>
                <a class="carousel-item" href="#three!" id="imgIndex"><img src="Assets/casa3.jpg"></a>
                <a class="carousel-item" href="#four!" id="imgIndex"><img src="Assets/apartamento1.jpg"></a>
                <a class="carousel-item" href="#five!" id="imgIndex"><img src="Assets/apartamento2.jpg"></a>
          </div>
        </section>
        <%@include file="footer.jsp" %>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="Assets/js/materialize.js"></script>
        <script>
             $(document).ready(function(){
             $('.carousel').carousel();
         });
        </script>
    </body>
</html>
