/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author iphon
 */
@WebServlet(urlPatterns = {"/NameHandler"})
public class NameHandler extends HttpServlet {

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
            String nombre = request.getParameter("txtNombre");
            int dia = Integer.parseInt(request.getParameter("txtDia"));
            int mes = Integer.parseInt(request.getParameter("txtMes"));
            int añonacimiento = Integer.parseInt(request.getParameter("txtAñonacimiento"));
            int añoactual = Integer.parseInt(request.getParameter("txtAño"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NameHandler</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=1<tr><td>Nombre </td><td>" + nombre + "</td></tr>");
            out.println("<tr><td>Día de nacimiento </td><td>" + dia + "</td></tr>");
            out.println("<tr><td>Mes de nacimiento </td><td>"  + mes + "</td></tr>");
            out.println("<tr><td>Año de nacimiento </td><td>" + añonacimiento + "</td></tr>");
            out.println("<tr><td>Edad </td><td>" + (añoactual - añonacimiento) + "</td></tr>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
