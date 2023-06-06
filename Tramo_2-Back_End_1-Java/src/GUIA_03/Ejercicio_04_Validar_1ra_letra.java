/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_03;
import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/

public class Ejercicio_04_Validar_1ra_letra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una frase o palabra: ");
        String frase = leer.nextLine();
        
        if (frase.substring(0,1).equalsIgnoreCase("a") ) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }   
}
