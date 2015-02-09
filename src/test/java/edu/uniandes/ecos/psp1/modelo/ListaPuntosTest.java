/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.modelo;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author deividosorio
 */
public class ListaPuntosTest extends TestCase {
    
    public ListaPuntosTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getB0 method, of class ListaPuntos.
     */
    public void testGetB0_test1() {
        System.out.println("getB0");
        
        String data = "130,186-650,699-99,132-150,272-128,291-302,331-"
                + "95,199-945,1890-368,788-961,1601";
        
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
        
        double expResult = -22.55;
        double resultB0 = datosPuntos.getB0();
        assertEquals(expResult, resultB0);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    /**
     * Test of getB1 method, of class ListaPuntos.
     */
    public void testGetB1_test1() {
        System.out.println("getB1");
        
        String data = "130,186-650,699-99,132-150,272-128,291-302,331-"
                + "95,199-945,1890-368,788-961,1601";
        
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
        
        double expResult = 1.7279;
        double resultB1 = datosPuntos.getB1();
        assertEquals(expResult, resultB1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testGetRxy_test1() {
        System.out.println("getRxy");
        
        String data = "130,186-650,699-99,132-150,272-128,291-302,331-"
                + "95,199-945,1890-368,788-961,1601";
        
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
        
        double expResult = 0.9545;
        double resultRxy = datosPuntos.getRXY();
        assertEquals(expResult, resultRxy);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    
    /**
     * Test of getB0 method, of class ListaPuntos.
     */
    public void testGetR2_test1() {
        System.out.println("getR2");
        
        String data = "130,186-650,699-99,132-150,272-128,291-302,331-"
                + "95,199-945,1890-368,788-961,1601";
        
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
        
        double expResult = 0.9111;
        double resultR2 = datosPuntos.getR2();
        assertEquals(expResult, resultR2);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    
    public void testGetB0_test2() {
        System.out.println("getB0");
        
        String data = "130,15-650,69.9-99,6.5-150,22.4-128,28.4-302,65.9-"
                + "95,19.4-945,198.7-368,38.8-961,138.2";
        
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
        
        double expResult = -4.039;
        double resultB0 = datosPuntos.getB0();
        assertEquals(expResult, resultB0);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    /**
     * Test of getB1 method, of class ListaPuntos.
     */
    public void testGetB1_test2() {
        System.out.println("getB1");
        
        String data = "130,15-650,69.9-99,6.5-150,22.4-128,28.4-302,65.9-"
                + "95,19.4-945,198.7-368,38.8-961,138.2";
        
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
        
        double expResult = 0.1681;
        double resultB1 = datosPuntos.getB1();
        assertEquals(expResult, resultB1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testGetRxy_test2() {
        System.out.println("getRxy");
        
        String data = "130,15-650,69.9-99,6.5-150,22.4-128,28.4-302,65.9-"
                + "95,19.4-945,198.7-368,38.8-961,138.2";
        
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
        
        double expResult = 0.9333;
        double resultRxy = datosPuntos.getRXY();
        assertEquals(expResult, resultRxy);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    
    /**
     * Test of getB0 method, of class ListaPuntos.
     */
    public void testGetR2_test2() {
        System.out.println("getR2");
        
        String data = "130,15-650,69.9-99,6.5-150,22.4-128,28.4-302,65.9-"
                + "95,19.4-945,198.7-368,38.8-961,138.2";
        
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
        
        double expResult = 0.8711;
        double resultR2 = datosPuntos.getR2();
        assertEquals(expResult, resultR2);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    
    
    public void testGetB0_test3() {
        System.out.println("getB0");
        
        String data = "163,186-765,699-141,132-166,272-137,291-355,331-"
                + "136,199-1206,1890-433,788-1130,1601";
        
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
        
        double expResult = -23.92;
        double resultB0 = datosPuntos.getB0();
        assertEquals(expResult, resultB0);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    /**
     * Test of getB1 method, of class ListaPuntos.
     */
    public void testGetB1_test3() {
        System.out.println("getB1");
        
        String data = "163,186-765,699-141,132-166,272-137,291-355,331-"
                + "136,199-1206,1890-433,788-1130,1601";
        
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
        
        double expResult = 1.43097;
        double resultB1 = datosPuntos.getB1();
        assertEquals(expResult, resultB1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testGetRxy_test3() {
        System.out.println("getRxy");
        
        String data = "163,186-765,699-141,132-166,272-137,291-355,331-"
                + "136,199-1206,1890-433,788-1130,1601";
        
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
        
        double expResult = 0.9631;
        double resultRxy = datosPuntos.getRXY();
        assertEquals(expResult, resultRxy);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    
    /**
     * Test of getB0 method, of class ListaPuntos.
     */
    public void testGetR2_test3() {
        System.out.println("getR2");
        
        String data = "163,186-765,699-141,132-166,272-137,291-355,331-"
                + "136,199-1206,1890-433,788-1130,1601";
        
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
        
        double expResult = 0.9276;
        double resultR2 = datosPuntos.getR2();
        assertEquals(expResult, resultR2);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    
    
    
    public void testGetB0_test4() {
        System.out.println("getB0");
        
        String data = "163,15-765,69.9-141,6.5-166,22.4-137,28.4-355,65.9-"
                + "136,19.4-1206,198.7-433,38.8-1130,138.2";
        
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
        
        double expResult = -4.604;
        double resultB0 = datosPuntos.getB0();
        assertEquals(expResult, resultB0);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    /**
     * Test of getB1 method, of class ListaPuntos.
     */
    public void testGetB1_test4() {
        System.out.println("getB1");
        
        String data = "163,15-765,69.9-141,6.5-166,22.4-137,28.4-355,65.9-"
                + "136,19.4-1206,198.7-433,38.8-1130,138.2";
        
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
        
        double expResult = 0.140164;
        double resultB1 = datosPuntos.getB1();
        assertEquals(expResult, resultB1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testGetRxy_test4() {
        System.out.println("getRxy");
        
        String data = "163,15-765,69.9-141,6.5-166,22.4-137,28.4-355,65.9-"
                + "136,19.4-1206,198.7-433,38.8-1130,138.2";
        
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
        
        double expResult = 0.9480;
        double resultRxy = datosPuntos.getRXY();
        assertEquals(expResult, resultRxy);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    
    /**
     * Test of getB0 method, of class ListaPuntos.
     */
    public void testGetR2_test4() {
        System.out.println("getR2");
        
        String data = "163,15-765,69.9-141,6.5-166,22.4-137,28.4-355,65.9-"
                + "136,19.4-1206,198.7-433,38.8-1130,138.2";
        
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
        
        double expResult = 0.8988;
        double resultR2 = datosPuntos.getR2();
        assertEquals(expResult, resultR2);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
