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

public class Extra_02_Verificar_si_2_vectores_son_iguales {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        boolean bandera = true;
        
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el valor Nº: " + i + " para el vector 1.");
            v1[i] = leer.nextInt();
            System.out.println("Ingrese el valor Nº: " + i + " para el vector 2.");
            v2[i] = leer.nextInt();
        }
        
        System.out.print("V1: ");
        mostrar(v1);
        System.out.print("V2: ");
        mostrar(v2);
        
        for (int i = 0; i < 4; i++) {
            if (v1[i] != v2[i]) {
                bandera = false;
                break;
            }
        }
        
        if (bandera) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son distintos.");
        }
        
        
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}

