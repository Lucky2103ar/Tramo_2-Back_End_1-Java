/*
2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
        TERMINADO
 */

package GUIA_05;
import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Ejercicio_02_Llenado_de_vector_y_busqueda_de_valor {
    public static void main(String[] args) {
        int N, num, cont;
        int limiteMax = 10; //Para definir el valor random máximo +1
        Scanner leerNum = new Scanner(System.in);
        System.out.print("Ingrese la dimensión del vector: ");  
        N = leerNum.nextInt();
        int[] vector = new int [N];  
        //Lleno el VECTOR con valores aleatorios de 0 a 10
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random()*limiteMax);
            /*El método Math.random() en Java genera un número pseudoaleatorio
            de tipo double en el rango de [0.0, 1.0), es decir, incluye el 0 pero excluye el 1.*/
        }
        mostrarVectorInt(vector);   //Para observar el VECTOR
        
        System.out.print("Ingrese el numero a buscar (Entre 1 y "+(limiteMax-1)+"): ");  
        num = leerNum.nextInt();
        
        cont = 0;
        for (int i = 0; i < N; i++) {
              if (vector[i] == num) {
                  System.out.println("El "+num+" se encontró en la posición: "+i);
                  cont++;
            }
        }
        System.out.println("El "+num+" se encontró "+cont +" veces dentro del vector.");
    }
    
    //SUBPROCESO PARA MOSTRAR VECTOR DE ENTEROS
    public static void mostrarVectorInt(int[] V) {
        System.out.print("Vector[i] = {");
        for (int i = V.length-1; i >=0; i--) {
            System.out.print(V[i]);
            if (i > 0) {  System.out.print(",");  }
        }
        System.out.println("}");
    }
}
