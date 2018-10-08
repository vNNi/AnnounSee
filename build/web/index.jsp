<%-- 
    Document   : index
    Created on : 23/09/2018, 14:21:10
    Author     : Vinic
--%>

<%@page import="announsee.Models.Imovel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="announsee.DAO.ImovelDAO"%>
<%
ImovelDAO imovelDao = new ImovelDAO();
ArrayList<Imovel> casas = imovelDao.listIndexHouse();
ArrayList<Imovel> apartaments = imovelDao.listIndexApartaments();
ArrayList<Imovel> outros = imovelDao.listIndexOthers();
int i = 0,f=0,g=0;
%>
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
                     <%
                            for(Imovel ap:apartaments){ 
                            i++;
                        %>
                    <div class="col s6 m4">  
                        <div id="modal<%=i%>" class="modal">
                            <div class="modal-content">
                              <h4><%=ap.getFaceContato()%></h4>
                              <p>A bunch of text</p>
                            </div>
                            <div class="modal-footer">
                              <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                            </div>
                        </div>           
                        <div class="card">
                          <div class="card-image">
                              <img src="Assets/<%=ap.getPath()%>">
                            <span class="card-title "><%=ap.getBairro()%></span>
                            <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro modal-trigger"  href="#modal<%=i%>"><i class="material-icons">add</i></a>
                          </div>
                          <div class="card-content">
                            <p><%=ap.getDescricao()%></p>
                          </div>
                        </div>
                    </div>
                    <%
                    }
                    %>
                </div>
            <div class="center-align">
                    <a class="waves-effect waves-light btn-small verdeEscuro" href="continueVendo.jsp?category=apartamento">Continue vendo</a>
            </div>
        </section>
        <section class="container">
            <h4>Casas</h4>
            <div class="row">
                <hr class="col s1 hrColor">
                <br>
                <%
                for(Imovel c:casas){
                    f++;
                %>
                <div class="col s6 m4">
                <!-- Modal Structure -->
                <div id="modal<%=f%>" class="modal">
                  <div class="modal-content">
                    <h4><%=c.getFaceContato()%></h4>
                    <p>A bunch of text</p>
                  </div>
                  <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                  </div>
                </div>           
                    <div class="card">
                      <div class="card-image">
                          <img src="Assets/<%=c.getPath()%>">
                        <span class="card-title"><%=c.getBairro()%></span>
                        <a class="btn-floating halfway-fab waves-effect waves-light modal-trigger verdeEscuro" href="#modal<%=f%>"><i class="material-icons">add</i></a>
                      </div>
                      <div class="card-content">
                          <p class=""><%=c.getPreco()%>
                          <br>
                          <br>
                        <p><%=c.getDescricao()%></p>
                      </div>
                    </div>
                </div>
                        <%
                                        
                    }
                        %>
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
                <%
                    for(Imovel ot:outros){
                        g++;
                %>
                <div class="col s6 m4">
                     <div id="modal<%=g%>" class="modal">
                        <div class="modal-content">
                          <h4><%=ot.getFaceContato()%></h4>
                          <p>A bunch of text</p>
                        </div>
                        <div class="modal-footer">
                          <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                        </div>
                     </div>           
                    <div class="card">
                      <div class="card-image">
                          <img src="Assets/<%=ot.getPath()%>">
                        <span class="card-title"><%=ot.getBairro()%></span>
                        <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro"><i class="material-icons">add</i></a>
                      </div>
                      <div class="card-content">
                        <p class=""><%=ot.getPreco()%>
                        <br>
                        <br>
                        <p><%=ot.getDescricao()%></p>
                      </div>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
            <div class="center-align">
                 <a class="btn-floating halfway-fab waves-effect waves-light modal-trigger verdeEscuro" href="#modal<%=g%>"><i class="material-icons">add</i></a>
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
          $(document).ready(function(){
           $('.modal').modal();
          });
        </script>
    </body>
</html>
