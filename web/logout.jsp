<%-- 
    Document   : logout
    Created on : 27/09/2018, 22:55:25
    Author     : Vinic
--%>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
