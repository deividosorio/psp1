/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.controlador;

import edu.uniandes.ecos.psp1.modelo.Punto;
import edu.uniandes.ecos.psp1.modelo.ListaPuntos;
import edu.uniandes.ecos.psp1.vista.MainView;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa el controlador de la aplicación 
 * que comunica la interface con el mundo
 * @author deividosorio
 * @version 08/02/2015
 */
public class App extends HttpServlet{
 
    public static void main(String[] args) {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new App()), "/*");
        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        MainView.showHome(req,resp);
        MainView.showResults(req,resp,0,0,0);       
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                
        try {
            MainView.showHome(req,resp);
            consoleInput(req, resp);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo que recibe información de los puntos y retorna los valores de 
     * la desviación estándar y la correlación
     */
    public void consoleInput(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //System.out.println("Por favor, ingrese la cantidad de numeros que desea ingresar:");
        //Scanner input = new Scanner(System.in);
        String strPuntos = req.getParameter("puntos");

        String[] arrStrPuntos = strPuntos.split("-");
        String[] arrStrPunto;
        Punto newPunto;
        ArrayList<Punto> puntosList = new ArrayList<Punto>();

        for (String _strPunto : arrStrPuntos) {
            try {
                arrStrPunto = _strPunto.split(",");
                newPunto = new Punto(Double.parseDouble(arrStrPunto[0]),
                        Double.parseDouble(arrStrPunto[1]));
                puntosList.add(newPunto);
                
            }catch(NumberFormatException ex){
                MainView.error(req, resp);
            }
        }

        ListaPuntos datosPuntos = new ListaPuntos(puntosList);
        
        MainView.showResults(req, resp, datosPuntos.getB0(),
                datosPuntos.getB1(), datosPuntos.getR2());
    }
   
}
