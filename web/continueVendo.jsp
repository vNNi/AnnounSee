<%-- 
    Document   : ContinueVendo
    Created on : 07/10/2018, 10:35:10
    Author     : Vinic
--%>

<%@page import="announsee.DAO.ImovelDAO"%>
<%@page import="announsee.Models.Imovel"%>
<%@page import="java.util.ArrayList"%>
<%
 String category = request.getParameter("category").toString();
ArrayList<Imovel> imovel = new ImovelDAO().listPerCategory(category);
ArrayList<Imovel> dao = new ImovelDAO().listarCasas();
int i=0;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link rel="stylesheet" href="Assets/geral.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Continue Vendo</title>
    </head>
    <body>
        <%@include file="navBar.jsp" %>
        <section class="container">
            <h4><%=category%></h4>
                <div class="row">
                    <hr class="col s1 hrColor">
                    <br>
                    <%
                        if(category == null || category.isEmpty()){
                    %>
                        <%
                            for(Imovel h:dao){ 
                            i++;
                        %>
                    <div class="col s6 m4">  
                        <div id="modal<%=i%>" class="modal">
                            <div class="modal-content">
                              <h4><%=h.getFaceContato()%></h4>
                              <p>A bunch of text</p>
                            </div>
                        </div>           
                        <div class="card">
                          <div class="card-image">
                              <img src="Assets/<%=h.getPath()%>">
                            <span class="card-title "><%=h.getBairro()%></span>
                            <a class="btn-floating halfway-fab waves-effect waves-light verdeEscuro modal-trigger"  href="#modal<%=i%>"><i class="material-icons">add</i></a>
                          </div>
                          <div class="card-content">
                            <p><%=h.getDescricao()%></p>
                          </div>
                        </div>
                    </div>
                    <%
                                                    }
                    %>
                </div>
            </section>
                    <%
                        
                        } 
                    %>
                     <%
                            for(Imovel ap:imovel){ 
                            i++;
                        %>
                    <div class="col s6 m4">  
                        <div id="modal<%=i%>" class="modal">
                  <div class="modal-content">
                    <div class="container">
                        <img src="Assets/<%=ap.getPath()%>" class="materialboxed" data-caption="A picture of a way with a group of trees in a park" width="100%" max-height="350px">
                        <hr>
                        <h3 class="textColorDarkGreen tituloModal">R$ <%=ap.getPreco()%></h3>
                        <p><%=ap.getDescricao()%></p>  
                        <h5> Endereço:</h5>
                            <div>
                                <span><b>Bairro:</b> <%=ap.getBairro()%></span><br>
                                <span><b>Rua:</b> <%=ap.getRua()%></span><br>
                            </div>
                        <h5>Contatos:</h5>
                        <div>
                            <span><b>Nome:</b> <%=ap.getNome()%></span><br>
                            <span><b>Telefone:</b> <%=ap.getTelContato()%></span><br>
                            <span><b>Facebook:</b> <%=ap.getFaceContato()%></span><br>
                        </div>   
                    </div>
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
