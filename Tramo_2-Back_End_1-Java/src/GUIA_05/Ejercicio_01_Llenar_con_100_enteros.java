/*
1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
        TERMINADO
 */

package GUIA_05;

import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Ejercicio_01_Llenar_con_100_enteros {
    public static void main(String[] args) {
        int[] vector = new int [100];   //Defino y dimensiono el VECTOR
        Scanner leerNum = new Scanner(System.in);
        //Llenado del VECTOR
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        //Mostrado del VECTOR
        mostrarVectorIntDes(vector);
    }
    public static void mostrarVectorIntDes(int[] V) {
        System.out.print("Vector[i] = {");
        for (int i = V.length-1; i >=0; i--) {
            System.out.print(V[i]);
            if (i > 0) {  System.out.print(",");  }
        }
        System.out.print("}");
    }
}
