<%-- 
    Document   : lab1
    Created on : 8 апр. 2021 г., 23:13:12
    Author     : Danya
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is a Lab1</h1>
        
        <%! MyFirstJavaClass mFJS = new MyFirstJavaClass(5);%>
        <%
         int x = mFJS.getMyInt();
         x+= 3;
         x%=3;
        %>
        
        <p> 8mod3 = <%=x%></p>
        <a href="index.jsp">Home</a>
    </body>
</html>
