/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07;

import GUIA_07_ENTIDADES.Rectangulo;
import java.util.Scanner;


/**
 * @Lucky2103ar
 */
public class Ejercicio_04_Crear_clase_rectangulo {
    public static void main(String[] args) {
        Rectangulo cuadradoCheto = new Rectangulo();
        cuadradoCheto.crearRectangulo();
        
        Scanner leerNum = new Scanner(System.in);
        
        do{
            if (cuadradoCheto.getBase() <= 0 ) {
                System.out.print("El valor de la BASE no es correcto. Ingrese un valor entero positivo: ");
                cuadradoCheto.setBase(leerNum.nextInt());    
            }
            if (cuadradoCheto.getAltura() <= 0 ) {
                System.out.print("El valor de la ALTURA no es correcto. Ingrese un valor entero positivo: ");
                cuadradoCheto.setAltura(leerNum.nextInt());    
            }
        } while (cuadradoCheto.getBase() <= 0 || cuadradoCheto.getAltura() <= 0);
    }
}