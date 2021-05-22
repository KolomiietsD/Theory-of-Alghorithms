/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

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
@WebServlet(name = "Lab4Servlet", urlPatterns = {"/lab4"})
public class Lab4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StrF lab4view = new StrF();
        String text = "The Internet of Things or IoT refers to the billions of physical devices around the world that are now connected to the internet all collecting and sharing data Thanks to the arrival of supercheap computer chips and the ubiquity of wireless networks its possible to turn anything from something as small as a pill to something as big as an aeroplane into a part of the IoT Connecting up all these different objects and adding sensors to them adds a level of digital intelligence to devices that would be otherwise dumb enabling them to communicate realtime data without involving a human being. The Internet of Things is making the fabric of the world around us more smarter and more responsive merging the digital and physical universes How big is the Internet of Things Big and getting bigger there are already more connected things than people in the world Tech analyst company IDC predicts that in total there will be 416 billion connected IoT devices by 2025 or things It also suggests industrial and automotive equipment represent the largest opportunity of connected things but it also sees strong adoption of smart home and wearable devices in the near term Another tech analyst Gartner predicts that the enterprise and automotive sectors will account for 58 billion devices this year up almost a quarter on 2019 Utilities will be the highest user of IoT thanks to the continuing rollout of smart meters Security devices in the form of intruder detection and web cameras will be the second biggest use of IoT devices Building automation like connected lighting  will be the fastest growing sector followed by automotive connected cars and healthcare monitoring of chronic conditions The benefits of the IoT for business depend on the particular implementation agility and efficiency are usually top considerations";//неочищенный текст
        
                String result = StrF.lab4equation(text);
        request.setAttribute("result", result);
        
        String result1 = StrF.lab4equation1(result);
        request.setAttribute("result1", result1);
        
        String result2 = StrF.lab4equation2(result);
        request.setAttribute("result2", result2);
        
        String result3 = StrF.lab4equation3(result);
        request.setAttribute("result3", result3);
        
        String result4 = StrF.lab4equation4(result);
        request.setAttribute("result4", result4);
        
        request.getRequestDispatcher("lab4.jsp").forward(request,response);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab3Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab3Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
