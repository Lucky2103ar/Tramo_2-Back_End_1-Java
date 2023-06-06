/*
Clase Arrays
3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.

En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package GUIA_09;

import GUIA_09_SERVICIOS.ArregloService;

/**
 * Lucky2103ar
 */
public class Ejercicio_03_Crear_claseServicio_ArregloService {

        public static void main(String[] args) {
                ArregloService as = new ArregloService();
                Double[] A = new Double[50];
                Double[] B = new Double[20];

                as.inicializarA(A);
                as.mostrar(A);
                as.ordenar(A);
                as.inicializarB(B, A);
                as.mostrar(A, B);

        }

}
