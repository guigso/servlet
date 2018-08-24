/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oper1.goliveira
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/juros-simples.html"})
public class JurosSimples extends HttpServlet {

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
            out.println("<title>Juros Simples - Projeto01</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>label{display: inline-block;width: 90px;}.contentwrapper{background-color:lightblue;height:35%;width:30%;padding:3px;margin:0 auto;border-radius:5px;border-style:solid}table,th,td{border: 1px solid black;border-collapse: collapse;}</style>");
            out.println("<h3 style='text-align:center'><a href='home.html'>Home</a></h3>");
            out.println("<div class='contentwrapper'>");
            out.println("<h2>Calcular Juros Simples</h2>");
            out.println("<div style=''><form action='juros-simples.html'>");
            out.println("<label>Valor inicial: </label><input type='text' name ='v1'><br>");
            out.println("<label>Juros mensal: </label><input type='text' name ='jm' placeholder='Valor em %'><br>");
            out.println("<label>Meses: </label><input type='text' name ='mes'><br> ");
            out.println("<div style='text-align:center;margin:2px'><input type='submit' value='Calcular' class='btn btn-primary'></div></div>");
            
            /**Declarando as variaveis**/
            /** v1 = Valor Inicial **/
            double v1  = Double.parseDouble(request.getParameter("v1"));
            
            /** jm = Juros Mensal  **/
            double jm  = Double.parseDouble(request.getParameter("jm"));
            
            /** mes = Mês do ano    **/
            int    mes = Integer.parseInt(request.getParameter("mes"));
            
            /** Cauculo para gerar o juros simples   **/
            double js  = v1 * (1 + (jm / 100) * mes);
            
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class='contentwrapper' style='margin-top:15px'>");
            /** Exibe o resultado  **/
            out.println(" <h4>Valor do Juros Simples " + js + "</h4>");
            out.println("<input type='submit'  value='Resetar'>");
            out.println("</div>");

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
