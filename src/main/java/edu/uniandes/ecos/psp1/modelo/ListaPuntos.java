/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Clase que representa el mundo el conjunto de puntos y sobre estos se calcula
 * la regresión lineal el el coeficiente de correlación partiendo de variables
 * bo y b1
 *
 * @author deividosorio
 * @version 08/02/2015
 */
public class ListaPuntos {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    private Punto _punto;
    private ArrayList<Punto> _listaPuntos;
    private double xy, x2, y2;
    private double sumX, sumY, avgX, avgY;
    private double b0, b1, r2, rxy;
    private Utilidades util = new Utilidades();
    DecimalFormat formatter = new DecimalFormat("#0.0000");  

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    public ListaPuntos(ArrayList<Punto> listaPuntos) {
        this._listaPuntos = listaPuntos;
        xy = 0;
        x2 = 0;
        y2 = 0;
        sumX = 0;
        sumY = 0;
        b0 = 0;
        b1 = 0;
        r2 = 0;
        rxy = 0;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Método que devuelve la B0 de una lista de puntos
     *
     * @return La B0
     */
    public double getB0() {
        if (b0 != 0) {
            return b0;
        }

        if (b1 == 0) {
            getB1();
        }
        this.b0 = getAvgY() - (this.b1 * getAvgX());
        return b0;
    }

    /**
     * Método que devuelve el B1
     *
     * @return El número B1
     */
    public double getB1() {
        if (b1 != 0) {
            return b1;
        }
        b1 = (((getSumXY()) - (this._listaPuntos.size() * getAvgX() * getAvgY()))
                / ((getSumX2()) - (this._listaPuntos.size() * Math.pow(getAvgX(),2))));
        return b1;
    }

    /**
     * Método que devuelve el r2
     *
     * @return El número r2
     */
    public double getR2() {
        if (r2 != 0) {
            return r2;
        }

        double _rxy = getRXY();
        return _rxy * _rxy;
    }

    /**
     * Método que devuelve el r(x,y)
     *
     * @return El número rxy
     */
    public double getRXY() {
        if (rxy != 0) {
            return rxy;
        }

        double num = 0;
        double den1 = 0;
        double den2 = 0;

        num = (this._listaPuntos.size() * (getSumXY())) - (getSumX() * getSumY());
        den1 = ((this._listaPuntos.size() * getSumX2()) - Math.pow(getSumX(), 2));
        den2 = ((this._listaPuntos.size() * getSumY2()) - Math.pow(getSumY(), 2));

        rxy = num / (Math.sqrt(den1 * den2));
        return rxy;
    }

    /**
     * *************************************************************
     * @Section 1: Métodos privados
     */
    /**
     * Método que devuelve la sumatoria de la multiplicación de Xi * Yi
     *
     * @return El average de una lista de números
     */
    private double getSumXY() {
        if (xy != 0) {
            return xy;
        }

        for (Punto _punto : this._listaPuntos) {
            try {
                xy += (_punto.getX() * _punto.getY());
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        return xy;
    }

    /**
     * Método que devuelve la sumatoria del cuadrado de x de la lista de puntos
     *
     * @return El average de una lista de números
     */
    private double getSumX2() {
        if (x2 != 0) {
            return x2;
        }

        for (Punto _punto : this._listaPuntos) {
            try {
                x2 += Math.pow((_punto.getX()), 2);
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        return x2;
    }

    /**
     * Método que devuelve la sumatoria del cuadrado de y de la lista de puntos
     *
     * @return El average de una lista de números
     */
    private double getSumY2() {
        if (y2 != 0) {
            return y2;
        }

        for (Punto _punto : this._listaPuntos) {
            try {
                y2 += Math.pow((_punto.getY()), 2);
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        return y2;
    }

    /**
     * Método que devuelve la sumatoria Xi
     *
     * @return sumX
     */
    private double getSumX() {
        if (sumX != 0) {
            return sumX;
        }

        for (Punto _punto : this._listaPuntos) {
            try {
                sumX += _punto.getX();
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        return sumX;
    }

    /**
     * Método que devuelve la sumatoria Yi
     *
     * @return sumY
     */
    private double getSumY() {
        if (sumY != 0) {
            return sumY;
        }

        for (Punto _punto : this._listaPuntos) {
            try {
                sumY += _punto.getY();
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        return sumY;
    }

    /**
     * Método que devuelve el promedio de los valores de X
     *
     * @return avgX
     */
    private double getAvgX() {
        if (avgX != 0) {
            return avgX;
        }

        LinkedList list = new LinkedList();
        for (Punto _punto : this._listaPuntos) {
            try {
                list.add((double) _punto.getX());
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        avgX = util.obtenerMedia(list);
        return avgX;
    }

    /**
     * Método que devuelve el promedio de los valores de X
     *
     * @return avgY
     */
    private double getAvgY() {
        if (avgY != 0) {
            return avgY;
        }

        LinkedList list = new LinkedList();
        for (Punto _punto : this._listaPuntos) {
            try {
                list.add((double) _punto.getY());
            } catch (NumberFormatException ex) {
                return -1;
            }
        }
        avgY = util.obtenerMedia(list);
        return avgY;
    }

    /**
     * @Section 1: Fin section 1 de métodos privados
     * **********************************************
     */
}
