<%-- 
    Document   : lab62
    Created on : 23 мая 2021 г., 22:44:27
    Author     : Danya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="knu.fit.ist.ta.lab6.BinaryTree"%>
<%@page import="knu.fit.ist.ta.lab6.BinaryTreePr"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%! BinaryTree tree = new BinaryTree();%>
                <%
                    tree.add(15);
                    tree.add(9);
                    tree.add(14);
                    tree.add(3);
                    tree.add(2);
                    tree.add(12);
                    tree.add(6);
                    tree.add(5);
                %>
                <pre>
                <p>Результат:<br> <%= BinaryTreePr.printNode(tree.getRoot())%></p>
                </pre>
                <%tree.mirrorTree(tree.getRoot()); %>
                <pre>
                <p>Результат:<br> <%= BinaryTreePr.printNode(tree.getRoot())%></p>
                </pre>
                <div>
            <form action="index.jsp">
                <input type="submit" value="Home">
            </form>
        </div>
    </body>
</html>
