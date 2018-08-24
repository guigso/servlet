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
@WebServlet(name = "JurosCompostos", urlPatterns = {"/juros-compostos.html"})
public class JurosCompostos extends HttpServlet {

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
            out.println("<title>Juros compostos - Projeto01</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>.texto{\n"
                    + "        font-family: Verdana, Times, serif;\n"
                    + "        color: rgb(253, 253, 253);\n"
                    + "        text-shadow: 1px 2px rgb(123, 132, 141);\n"
                    + "        line-height: 1.7;\n"
                    + "        letter-spacing: 0.6px;\n"
                    + "    }\n" + "label{display: inline-block;width: 130px;text-align:center}.contentwrapper{background-color:rgb(44, 165, 196);height:35%;width:40%;padding:3px;margin:0 auto;border-radius:5px;border-style:solid}table,th,td{border: 1px solid black;border-collapse: collapse;}</style>");
            out.println("<nav style='margin-bottom:5px;border-radius:5px;;border:solid 2px black'class=\"navbar navbar-dark bg-info\">\n"
                    + " <a class=\"navbar-brand\" href=\"./home.html\"><h4>Home</h4></a>\n"
                    + "</nav>");
            out.println("<div class='contentwrapper'>");
            out.println("<h2 class ='texto'style='text-align:center;'>Calcular Juros Compostos</h2>");
            out.println("<div class='form-group texto'><form action='juros-compostos.html'>");
            out.println("<label for='v1'>Valor inicial: </label><input type='text' id='v1' name ='v1'><br>");
            out.println("<label for='jm'>Juros mensal: </label><input type='text' id='jm' name ='jm' placeholder='Valor em %'><br>");
            out.println("<label for='mes'>Meses: </label><input type='text' id='mes' name ='mes'><br> ");
            out.println("<div style='text-align:center;margin:2px'><input type='submit' value='Calcular' class='btn btn-primary'></div></div>");
            out.println("</div>");
            double v1 = Double.parseDouble(request.getParameter("v1"));
            double jm = Double.parseDouble(request.getParameter("jm"));
            double mes = Double.parseDouble(request.getParameter("mes"));
            out.println("<div class='contentwrapper' style='margin-top:15px'><table class='table'>");
            out.println("<tr><thead class='thead-dark'><th>Mes</th><th>Montante</th></tr></thead>");
            for (int i = 1; i <= mes; i++) {
                out.println("<tr class='texto'>");
                out.println("<td>" + i + "º" + "</td>");
                out.println("<td>" + "R$ " + Math.round((v1 * (Math.pow((1 + jm / 100), i))) * 100.0) / 100.0 + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<div style='text-align:center;'><a href=\"juros-compostos.html\" style=\"margin-top:5px;\" class =\"btn btn-danger\">Resetar</a></div>");
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
