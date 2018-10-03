<%-- 
    Document   : anuncie
    Created on : 24/09/2018, 21:42:44
    Author     : Vinic
--%>
<%
 if(session.getAttribute("logado")!="true"){
     response.sendRedirect("login.jsp");
 }
%>

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
            <form class="col s12" method="post" action="Anunciar2" enctype="multipart/form-data">
              <div class="row">
                <div class="input-field col s6">
                    <input name="bairro" id="first_name" type="text" class="validate" required>
                  <label for="bairro">Bairro</label>
                </div>
                <div class="input-field col s6">
                  <input id="preco" type="number" name="preco" class="validate" required>
                  <label for="preco">Preço</label>
                </div>
              </div>
              <div class="row">
                <div class="input-field col s12">
                  <input  name="descricao"  id="description" type="text" class="validate" required>
                  <label for="descricao">Descrição</label>
                </div>
              </div>
              <div class="row">
                <div class="input-field col s12">
                  <input id="rua" name="rua" type="text" class="validate" required>
                  <label for="rua">Rua</label>
                </div>
              </div>
                <div class="row">
                  <div class="col s6">
                      <label>Categorias</label>
                    <p>
                      <label>
                        <input name="categoria" type="radio" value="casa" checked />
                        <span>Casa</span>
                      </label>
                    </p>
                    <p>
                      <label>
                        <input name="categoria" value="apartamento" type="radio" />
                        <span>Apartamento</span>
                      </label>
                    </p>
                    <p>
                      <label>
                          <input name="categoria" value="outros" type="radio"  />
                        <span>Outros</span>
                      </label>
                    </p>
                  </div>
                    <div class="col 6 s6">
                        <div class="file-field input-field">
                          <div class="btn">
                            <span>Foto</span>
                            <input type="file" name="foto" required>
                          </div>
                          <div class="file-path-wrapper">
                            <input class="file-path validate" type="text" required>
                          </div>
                        </div>
                        <small>limite 1500x1250</small>
                    </div> 
              </div>
              <div class="row">
                <div class="input-field col s6">
                  <input id="telefone" name="telContato" type="number" class="validate" required>
                  <label for="telefone">Telefone</label>
                </div>
                 <div class="input-field col s6">
                  <input id="nome" name="nome" type="text" class="validate" required>
                  <label for="nome">Nome</label>
                </div>
              </div>  
                 <div class="row">
                <div class="input-field col s12">
                  <input id="facebook" name="facebook" type="text" class="validate">
                  <label for="facebook">Facebook</label>
                </div>
              </div> 
                <div>
                    <button type="submit" class="waves-effect waves-light btn right" value="ANUNCIAR"> ANUNCIAR
                    </button>
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
