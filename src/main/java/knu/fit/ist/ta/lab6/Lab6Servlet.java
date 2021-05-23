/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Danya
 */

@WebServlet(name = "Lab6Servlet", urlPatterns = {"/lab6"})
public class Lab6Servlet extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Part1 part1 = new Part1();
        String find = request.getParameter("k");
        String result = part1.reverseString(find);
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab6.jsp").forward(request, response);
    }
}
