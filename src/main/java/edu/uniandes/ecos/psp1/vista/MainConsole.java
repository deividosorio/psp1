/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.vista;

import edu.uniandes.ecos.psp1.modelo.ListaPuntos;
import edu.uniandes.ecos.psp1.modelo.Punto;
import java.util.ArrayList;

/**
 *
 * @author deividosorio
 */
public class MainConsole {

    public static void main(String[] args) {
        String data = "130,186-650,699-99,132-150,272-128,291-302,331-"
                + "95,199-945,1890-368,788-961,1601";
        double xk = 386;
        
        String[] arrStrPuntos = data.split("-");
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
                System.out.println(ex.getMessage());
            }
        }
         ListaPuntos datosPuntos = new ListaPuntos(puntosList);
         System.out.println(datosPuntos.getB0() + "\n");
         System.out.println(datosPuntos.getB1() + "\n");
         System.out.println(datosPuntos.getRXY()+ "\n");
         System.out.println(datosPuntos.getR2() + "\n");
         System.out.println(datosPuntos.getRXY()+ "\n");
         System.out.println(datosPuntos.getYk(xk)+ "\n");
    }
}