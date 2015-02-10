/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Clase que representa la vista para el ambiente web que será visualizada en un
 * explorador
 *
 * @author deividosorio
 * @version 08/02/2015
 */
public class MainView {

    public static void showHome(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP1 Programa que calcula Regresión lineal y "
                + "Coeficiente de varición</h1><br>");
        pw.println("<p>ECOS 2015 <br>Deivid Alexander Osorio Barrera</p><br><br>");
        
        pw.write("<p> Ingrese los valores X y Y de cada punto separados por un"
                + "coma (,) y cada punto separado por guion (-)</p> \n");
        pw.write("<form action=\"calc\" method=\"post\"> \n"
                + "    Puntos(x,y): <input type=\"text\" size=\"35\" name=\"puntos\"><br>\n"
                + "    Xk: <input type=\"text\" value=\"386\" name=\"xk\">\n"
                + "    <input type=\"submit\" value=\"Puntos\"> </form> ");
        pw.write("</html>");

    }

    public static void showResults(HttpServletRequest req, HttpServletResponse resp, 
            double b0, double b1, double r2, double rxy, double yk )
            throws ServletException, IOException {
        
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        resp.getWriter().println("<br><hr>");
        resp.getWriter().println("<h2>Resultados<h2>");
        resp.getWriter().println("<b>Valor B0 :</b>   " + formatter.format(b0) + "<br>");
        resp.getWriter().println("<b>Valor B1 :</b>   " + formatter.format(b1) + "<br>");
        resp.getWriter().println("<b>Valor R2 : </b>  " + formatter.format(r2) + "<br>");
        resp.getWriter().println("<b>Valor Rxy: </b>  " + formatter.format(rxy) + "<br>");
        resp.getWriter().println("<b>Predicción: </b> " + formatter.format(yk) + "<br>");
    }

    public static void error(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Error!!!");
    }
    
}
