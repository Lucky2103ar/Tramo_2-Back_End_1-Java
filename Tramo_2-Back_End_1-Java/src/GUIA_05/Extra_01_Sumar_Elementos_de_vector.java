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

public class Extra_01_Sumar_Elementos_de_vector {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + i);
            vector[i] = leer.nextInt();
        }
        
        mostrar(vector,n);
        
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de los valores de los vectores es: " + suma);
        
        
    }
    
    public static void mostrar(int[] vector,int n) {
            for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}
 