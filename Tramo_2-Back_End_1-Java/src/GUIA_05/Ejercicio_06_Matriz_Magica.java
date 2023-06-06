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

public class Ejercicio_06_Matriz_Magica {
    public static void main(String[] args) {

            int matriz[][] = new int[3][3];
            int num;

            Scanner leer = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    do {
                        System.out.println("Ingrese un valor para: " + i + j);
                        num = leer.nextInt();

                        if (num > 9 || num < 1) {
                            System.out.println("Vuelva a ingresar: ");
                            } 
                    } while (num > 9 || num < 1 );

                    matriz[i][j] = num;

                }
            }

            mostrarVectorInt(matriz);
            verificar(matriz);

        }

    public static void mostrarVectorInt(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    public static void verificar(int[][] matriz) {
        int suma,sumaAux;
        boolean bandera = true;

        suma = 0;

        for (int j = 0; j < 3; j++) {
            suma += matriz[0][j];
        }

        for (int i = 0; i < 3; i++) {
            sumaAux = 0;
            for (int j = 0; j < 3; j++) {
                sumaAux += matriz[i][j];
            }
            if (sumaAux != suma) {
                bandera = false;
                break;
            }
        }

        if (bandera) {
            for (int j = 0; j < 3; j++) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][j];
            }
            if (sumaAux != suma) {
                bandera = false;
                break;
            }
        }
    }

        if (bandera) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][i];
            }
            if (sumaAux != suma) {
                bandera = false;
            }
        }

        if (bandera) {
            sumaAux = 0;
            for (int i = 0; i < 3; i++) {
                sumaAux += matriz[i][2-i];
            }
            if (sumaAux != suma) {
                bandera = false;
            }
        }

        System.out.println("La matriz es mágica: " + bandera);

    }
}

