/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_07;

import GUIA_07_ENTIDADES.RectanguloExtra;

/**
 *
 * @author Miguel Ángel
 */
public class Extra1_06_Crear_clase_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloExtra rectangulo1 = new RectanguloExtra(4 ,6);
//        int area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + rectangulo1.calcular_area());
    }
    
}
