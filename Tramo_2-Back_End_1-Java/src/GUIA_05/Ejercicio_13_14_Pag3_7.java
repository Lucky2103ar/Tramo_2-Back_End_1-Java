/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_05;

import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Ejercicio_13_14_Pag3_7 {
    public static void main(String[] args) {
        String[] Equipo;    //Defino y creo mi vector
        
        Scanner leerStr = new Scanner(System.in, "ISO-8859-1");
        Scanner leerNum = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de compañeros: ");
        int n = leerNum.nextInt();
        
        Equipo = new String[n]; //Dimensiono mi vector
        
        // Asigno valores mediante el For
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del "+( i+1)+"° compañero: ");
            Equipo[i] = leerStr.nextLine();
        }
        // Muestro el vector
        System.out.println("");
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Equipo["+i+ "] = "+Equipo[i]);
        }
    }
}
