package edu.uniandes.ecos.psp1.modelo;

/*
 * Esta clase pertenece al mundo del aplicativo que se encarga de hacer las
 * operaciones de calcular desviación y media
 */
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author deividosorio
 */
public class Utilidades {

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    private double sumatoria;
    private double media;
    private int cantidadLista;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    public Utilidades() {

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Método que calcula la desviación estándar
     *
     * @return Desviación estándar
     */
    public double obtenerDesvStdr(LinkedList list) {
        cantidadLista = list.size();
        media = obtenerMedia(list);
        sumatoria = 0;
        for (Iterator i = list.iterator(); i.hasNext();) {
            sumatoria += Math.pow((Double.parseDouble(i.next().toString())
                    - media), 2);
        }
        return Math.sqrt(sumatoria / (cantidadLista - 1));
    }

    /**
     * Método que calcula la media de un listado de números
     *
     * @return media
     */
    public double obtenerMedia(LinkedList list) {
        cantidadLista = list.size();
        sumatoria = 0;
        for (Iterator i = list.iterator(); i.hasNext();) {
            sumatoria += Double.parseDouble(i.next().toString());;
        }
        return ((sumatoria) / (cantidadLista));
    }
}
