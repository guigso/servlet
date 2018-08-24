/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oper1.goliveira
 */
public class home extends HttpServlet {

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
            out.println("<style>\n" +
"    #container {\n" +
"        background-color: rgb(44, 165, 196);\n" +
"        border-radius: 10px;\n" +
"        padding: 20px;\n" +
"        width: 70%;\n" +
"        margin: auto;\n" +
"    }\n" +
"\n" +
"    .texto{\n" +
"        font-family: Verdana, Times, serif;\n" +
"        text-align: left;\n" +
"        color: rgb(253, 253, 253);\n" +
"        text-shadow: 1px 2px rgb(123, 132, 141);\n" +
"        line-height: 1.7;\n" +
"        letter-spacing: 0.6px;\n" +
"        font-size: 17px;\n" +
"    }\n" +
"\n" +
"    #button  {\n" +
"        background-color: rgb(154, 155, 155);\n" +
"        text-decoration: none;\n" +
"        font-size: 18px;\n" +
"        margin: auto;\n" +
"        text-align: center;\n" +
"    }\n" +
"\n" +
"    a:hover,\n" +
"    a:active {\n" +
"        background-color: rgb(27, 121, 145);\n" +
"        color: rgb(106, 110, 110);\n" +
"        border-radius: 6px;\n" +
"        border: 8;\n" +
"    }\n" +
"\n" +
"    a:link,\n" +
"    a:visited {\n" +
"\n" +
"        color: rgb(253, 253, 253);\n" +
"        border: 2px solid white;\n" +
"        border-radius: 6px;\n" +
"        padding: 7px 7px;\n" +
"        text-align: center;\n" +
"        text-decoration: none;\n" +
"        display: inline-block;\n" +
"    }\n" +
"\n" +
"    #logo {\n" +
"        width: 10%;\n" +
"        margin-right: 10px;\n" +
"    }\n" +
"    #titulo{\n" +
"        font-size: 30px ;\n" +
"    }\n" +
"    #footer{\n" +
"        width: 20%;\n" +
"    }\n" +
"</style>");
            out.println("<head>");
            out.println("<title>Trabalho POO</title>");            
            out.println("</head>");
            out.println("<body><div id=\"container\">\n" +
"        <div style=\"width: 100%; float: left;\">\n" +
"            <div style=\"width: 30%; float: right;\">\n" +
"                <img style=\"width: 80%; float: left;\" src=\"./images/logotipo-fatec-pg.png\" alt=\"FatecPG\">\n" +
"            </div>\n" +
"            <div style=\"width: 70%; float: left;\">\n" +
"                <p class=\"texto\" id=\"titulo\" >Trabalho POO - Professor: Ricardo Pupo</h1>\n" +
"            </div>\n" +
"        </div>\n" +
"        <p class=\"texto\">\n" +
"            <strong style=\"font-size: 19px;\">Integrantes:</strong><br> Guilherme de Oliveira Souza<br> Samara Oliveira Motta<br>            Ana\n" +
"            Paula Augusto\n" +
"            <br> Renan dos Santos Souza\n" +
"        </p>\n" +
"        <hr>\n" +
"        <br>\n" +
"        <p class=\"texto\">Juros simples é uma taxa aplicado a um montante inicial que pode ser acrescido, na maioria das vezes, mensal ou\n" +
"            anualmente. Calcule o Juros Simples neste link:</p>\n" +
"        <section style=\"margin: auto; text-align: center;padding-top: 20px;padding-bottom: 20px;\">\n" +
"            <a id=\"button\" class=\"texto\" href=\"./juros-simples.html\">Juros Simples</a>\n" +
"        </section>\n" +
"        <p class=\"texto\">Os juros compostos são a prática de juros sobre juros. Eles são muito utilizados pelo sistema financeiro, pois\n" +
"            oferecem maior rentabilidade se comparados ao juro simples. Calcule o Juros Composto neste link:</p>\n" +
"        <section style=\"margin: auto;text-align: center;padding-top: 20px;padding-bottom: 20px;\">\n" +
"            <a id=\"button\" class=\"texto\" href=\"./juros-compostos.html\">Juros Composto</a>\n" +
"        </section>\n" +
"        <a href=\"https://github.com/guigso/servlet/\">GitHub</a>\n" +
"    </div></body>");
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
