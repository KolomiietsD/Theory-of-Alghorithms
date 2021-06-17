<%-- 
    Document   : exam
    Created on : 16 июн. 2021 г., 18:21:41
    Author     : Danya
--%>



<%@page import="knu.fit.ist.ta.exam.FormulaXY"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <h1>Коломієць Данило варіант № 12</h1>
        <h2>Функція : f(x) = 4/(9x + 4)</h2>
        <%! FormulaXY formula = new FormulaXY(66); %>
        
        <p>Значення Аргументу: <%= formula.GetX()%> </p>
        <p>Значення Функції:<%= formula.Calculate() %></p>        
    </body>
</html>

