/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_05;

/**
 * @author Lucky2103
 **/

public class Ejercicio_04_Llenar_matriz_aleatoria_mostrar_traspuesta {
    public static void main(String[] args) {
    // Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
    // y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
    // A se denota por B y se obtiene cambiando sus filas por columnas (o visceversa)
        int matriz[][] = new int[4][4];

        System.out.println("Matriz Original");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] =(int) (Math.random()*10+1);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Matriz Traspuesta");    
        for ( int i = 0; i < 4; i++) {
            for ( int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");  
        }
    }
}
