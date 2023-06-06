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

public class Ejercicio_03_String_8_de_largo {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una frase o palabra de 8 caracteres: ");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
}
