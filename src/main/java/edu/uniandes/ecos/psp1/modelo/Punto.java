/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.modelo;

/**
 * @Number Program: 3
 * @author deividosorio
 * @version 08/02/2015
 * @Description: Esta clase es la representación lógica de un punto que tien coordinadas
 * en el eje X y el eje Y
 */

/**
/* Listing Methods
 *    Punto (Constructor)
 */
public class Punto {
    
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    private double x;
    private double y;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    
    /**
     * Método que retorna el valor x del punto
     * @return x del tipo double
     */
    public double getX(){
        return this.x;
    }
    
    /**
     * Método que retorna el valor de Y del punto
     * @return y del tipo double
     */
    public double getY(){
        return this.y;
    }
    
}
