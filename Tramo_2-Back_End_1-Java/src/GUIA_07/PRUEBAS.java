/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07;

import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class PRUEBAS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        String apellido = scanner.next();
        System.out.println("Su nombre es " + nombre + " " + apellido);

//        System.out.print("Ingrese una oración: ");
//        String oracion = scanner.nextLine();
//        System.out.println("La oración que ingresó es: " + oracion);
    }
}


