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
                + "Coeficiente de varición</h1>");
        pw.println("<p>ECOS 2015 <br>Deivid Alexander Osorio Barrera</p><br>");
        
        pw.write("<p> Ingrese los valores X y Y de cada punto separados por una"
                + "coma (,) y cada punto separado por guion (-), cada punto debe"
                + "tener su respectivo valor en x y su valor en y.</p> \n");
        pw.write("<form action=\"calc\" method=\"post\"> \n"
                + "    Puntos(x,y): <input type=\"text\" size=\"45\" name=\"puntos\"><br>\n"
                + "    Xk: <input type=\"text\" value=\"386\" name=\"xk\"> <br>\n"
                + "    <input type=\"submit\" value=\"Calcular\"> </form> ");
        pw.write("</html>");

    }

    public static void showResults(HttpServletRequest req, HttpServletResponse resp, 
            double b0, double b1, double r2, double rxy, double yk )
            throws ServletException, IOException {
        
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        resp.getWriter().println("<br><hr>");
        resp.getWriter().println("<h2>Resultados</h2>");
        resp.getWriter().println("<b>Valor B0 :</b>   " + formatter.format(b0) + "<br>");
        resp.getWriter().println("<b>Valor B1 :</b>   " + formatter.format(b1) + "<br>");
        resp.getWriter().println("<b>Valor R2 :</b>   " + formatter.format(r2) + "<br>");
        resp.getWriter().println("<b>Valor Rxy: </b>  " + formatter.format(rxy) + "<br>");
        resp.getWriter().println("<b>Predicción: </b> " + formatter.format(yk) + "<br>");
        
        resp.getWriter().println("<hr>");
        resp.getWriter().println("<h2>Test Realizados</h2>");
        resp.getWriter().println("<b>Lista test1: <br></b>130,186-650,699-"
                + "99,132-150,272-128,291-302,331-95,199-945,1890-368,788-961,1601<br>");
        resp.getWriter().println("<b>Lista test2: <br></b>130,15-650,69.9-"
                + "99,6.5-150,22.4-128,28.4-302,65.9-95,19.4-945,198.7-368,38.8-961,138.2<br>");
        resp.getWriter().println("<b>Lista test3: <br></b>163,186-765,699-"
                + "141,132-166,272-137,291-355,331-136,199-1206,1890-433,788-1130,1601<br>");
        resp.getWriter().println("<b>Lista test4: <br></b>163,15-765,69.9-"
                + "141,6.5-166,22.4-137,28.4-355,65.9-136,19.4-1206,198.7-433,38.8-1130,138.2<br>");
        
        
    }

    public static void error(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Error!!!");
    }
    
}
