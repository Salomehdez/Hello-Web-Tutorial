<%-- 
    Document   : response
    Created on : 19/04/2023, 09:18:21 AM
    Author     : iphon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre = request.getParameter("txtNombre");
    int dia = Integer.parseInt(request.getParameter("txtDia"));
    int mes = Integer.parseInt(request.getParameter("txtMes"));
    int añonacimiento = Integer.parseInt(request.getParameter("txtAñonacimiento"));
    int añoactual = Integer.parseInt(request.getParameter("txtAñoactual"));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello!</h1>
        <table border="1">
            <tr>
                <td>Nombre: </td>
                <td><%=nombre%></td>
            </tr>
            <tr>
                <td>Día de nacimiento: </td>
                <td><%=dia%></td>
            </tr>
            <tr>
                <td>Mes de nacimiento: </td>
                <td><%=mes%></td>
            </tr>
            <tr>
                <td>Año de nacimiento: </td>
                <td><%=añonacimiento%></td>
            </tr>
            <tr>
                <td>Año actual: </td>
                <td><%=añoactual%></td>
            </tr>
            <tr>
                <td>La edad que tienes es: </td>
                <td><%=añoactual - añonacimiento%></td>
            </tr>
        </table>
    </body>
</html>
