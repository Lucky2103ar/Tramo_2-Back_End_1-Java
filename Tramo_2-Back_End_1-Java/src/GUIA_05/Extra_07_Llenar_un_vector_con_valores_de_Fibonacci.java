/*
7. Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar
 */

package GUIA_05;

import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Extra_07_Llenar_un_vector_con_valores_de_Fibonacci {
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        
        System.out.print("Ingrese el orden del VECTOR: ");
        int n = leerNum.nextInt();
        
        int[] V = new int[n];
        
        for(int i=0; i < n; i++){
            if ( i == 0 ||  i == 1  )   { V[i] = 1;   }
            else    {   V[i] = V[i-1] + V[i-2]; }
        }
    
        System.out.print("V = ");
        mostrar(V);
 
    }
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
}
