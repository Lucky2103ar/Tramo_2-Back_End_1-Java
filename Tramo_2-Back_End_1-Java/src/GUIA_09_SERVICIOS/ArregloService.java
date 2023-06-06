/*
Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
 */
package GUIA_09_SERVICIOS;

import java.util.Arrays;
import java.util.Collections;

/**
 * Lucky2103ar
 */
public class ArregloService {

        //        1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
        //        números aleatorios.
        public void inicializarA(Double[] A) {
                for (int i = 0; i < A.length; i++) {
                        A[i] = Math.random() * 10;
                }
        }

//        2) Método mostrar recibe un arreglo por parámetro y lo muestra por
//        pantalla.
        public void mostrar(Double[] V) {
                System.out.println("ARREGLO =" + Arrays.toString(V));
//               System.out.print("ARREGLO = {");
//                for (int i = 0; i < V.length; i++) {
//                        if (i > 0) {
//                                System.out.print(", ");
//                        }
//                        System.out.print(V[i]);
//                }
//                System.out.println("}");
        }

        public void mostrar(Double[] V, Double[] W) {
                System.out.println("1er ARREGLO =" + Arrays.toString(V));
                System.out.println("2do ARREGLO =" + Arrays.toString(W));
        }

//        3) Método ordenar recibe un arreglo por parámetro y lo ordena de
//        mayor a menor.          
        public void ordenar(Double[] V) {
                Arrays.sort(V, Collections.reverseOrder());
//                Double[] Vaux = V;
//                Arrays.sort(Vaux);
//                for (int i = 0, j = V.length - 1; i < V.length; i++, j--) {
//                        V[i] = Vaux[j];
//                }

        }

//        4) Método inicializarB copia los primeros 10 números del arreglo A en el
//        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5
        public void inicializarB(Double[] B, Double[] A) {
                for (int i = 0; i < B.length / 2; i++) {
                        B[i] = A[i];
                }
                
                Arrays.fill(B, Math.round(B.length / 2) , B.length, 0.5);
//                Arrays.fill( B, 10, 20, 0.5);
        }

}
