<%-- 
    Document   : thongbao
    Created on : Jul 14, 2021, 10:23:28 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>THÔNG BÁO!</h1>
        <%
            String thongbao = (String)request.getAttribute("tb");
            out.println(thongbao);
        %>
        <br>
        <a href="/Product.jsp"> Danh sách sản phẩm </a>
    </body>
</html>
