<%-- 
    Document   : lab3
    Created on : 16 мая 2021 г., 14:45:01
    Author     : Danya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Заповнити масив з 20 дійсних чисел. Знайти порядковий номер того з них, що є найближчим до натурального числа k.</h1> 
        <h2>Порядковий номер</h2>
         <p><%=request.getAttribute("result")%></p>
         
         <div>
            <form action="lab3form.jsp">
                <input type="submit" value="New k">
            </form>
        </div>
    
     <div>
            <form action="index.jsp">
                <input type="submit" value="Home">
            </form>
        </div>
    </body>
</html>
