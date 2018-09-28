<%-- 
    Document   : navBar
    Created on : 23/09/2018, 18:17:13
    Author     : Vinic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<header>
            <nav class="verdeEscuro">
              <div class="nav-wrapper container">
                <a href="index.jsp" class="brand-logo" alt="Logo AnnounSee">AnnounSee</a>
                <ul id="nav" class="right hide-on-med-and-down">
                  <li><a href="anuncie.jsp" class="verdeClaro">Anuncie</a></li>
                  <li><a href="cadastro.jsp">Cadastre-se</a></li>
                  <%if(session.getAttribute("logado")=="true"){
                  %>
                  <li><a href="logout.jsp">Logout</a></li>
                  <%
                  }else{
                  %>
                    <li><a href="login.jsp">Login</a></li>
                  <%
                  }
                  %>
                </ul>
              </div>
        </nav>
        </header>