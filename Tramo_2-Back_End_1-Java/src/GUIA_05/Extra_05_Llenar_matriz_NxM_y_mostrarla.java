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

public class Extra_05_Llenar_matriz_NxM_y_mostrarla {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma=0;
        
        System.out.println("Ingrese el nro. de filas de la matriz: ");
        int n = leer.nextInt();
        System.out.println("Ingrese el nro. de columnas de la matriz: ");
        int m = leer.nextInt();
       
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("La suma de los elementos de la matriz es: " + suma);
        
    }
    
    
}

