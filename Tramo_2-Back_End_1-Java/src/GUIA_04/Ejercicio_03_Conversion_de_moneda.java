/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_04;

import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/

public class Ejercicio_03_Conversion_de_moneda {
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        Scanner leerChar = new Scanner(System.in);
        System.out.print("Ingrese el monto en EUROS: €");
        double e = leerNum.nextInt();
        String opc;
        boolean b;
        do {            
            System.out.println("");
            System.out.println("¿A qué moneda desea comvertir?"); 
            System.out.println("(Y)ENES.");
            System.out.println("(D)OLARES.");
            System.out.println("(L)IBRAS.");
            System.out.println("\n(S)alir.");
            System.out.print("          Ingrese su opción: ");
            opc = leerChar.next();
            b = !(opc.equalsIgnoreCase("Y") || opc.equalsIgnoreCase("D") || opc.equalsIgnoreCase("L") || opc.equalsIgnoreCase("S"));
            if (b) {    System.out.println("La opción ingresada no es válida.");    }
        } while (b);
        conversion(e,opc);
   }
 
    public static void conversion(double monto,String moneda){
        switch (moneda) {
            case "y":
            case "Y":   System.out.println("\n€" + monto + " convertido a YENES es: ¥" + (monto*129.852)); break;
            case "d":
            case "D":   System.out.println("\n€" + monto + " convertido a DOLARES es: u$s" + (monto*1.28611)); break;
            case "l":
            case "L":   System.out.println("\n€" + monto + " convertido a LIBRAS es: £" + (monto*0.86)); break;
        }
        System.out.println("\n");        
    }

}