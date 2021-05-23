<%-- 
    Document   : lab6
    Created on : 23 мая 2021 г., 21:52:09
    Author     : Danya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="knu.fit.ist.ta.lab6.Part1"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>виводить  цифри числа у зворотньому порядку на екран</h1>
        <label for="x"><b>Введіть число в декілька цифр : </b></label>
                    <form action="./lab6" method="post" lass="form-inline">
                <input type="text" name="k" placeholder="введіть число"/>
                <input type="submit" value="Ok"/>
                <p><%=request.getAttribute("result")%></p>
                <br></br>
              
               <br></br> 

                
                
    </body>
</html>
