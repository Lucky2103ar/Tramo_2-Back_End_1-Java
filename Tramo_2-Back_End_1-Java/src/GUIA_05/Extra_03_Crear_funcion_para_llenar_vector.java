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

public class Extra_03_Crear_funcion_para_llenar_vector {
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        rellenar(vector);
        mostrar(vector);
    }
    
    public static int[] rellenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        } 
        return vector;
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}

