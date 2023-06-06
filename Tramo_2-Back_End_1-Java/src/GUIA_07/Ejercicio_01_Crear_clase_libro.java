/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_07;

import GUIA_07_ENTIDADES.Libro;
import java.util.Scanner;

/**
 * Lucky2103ar
 */
public class Ejercicio_01_Crear_clase_libro {

        public static void main(String[] args) {
                // NO SE PUEDE TRABAJAR CON VECTORES DE OBJETOS
                Scanner leer = new Scanner(System.in, "ISO-8859-1");
                System.out.print("Ingrese la cantidad de libros a cargar: ");
                int N = leer.nextInt();
                Libro miBiblioteca[] = new Libro[N];

                for (int i = 0; i < N; i++) {
                        System.out.println("Vamos con el " + (i + 1) + "°");
                        Libro libro = new Libro();
                        libro.CargarLibro();
                        miBiblioteca[i] = libro;
                        System.out.println("");
                }

                System.out.print("¿Desea ver los libros cargados en la biblioteca? (s/n): ");
                char resp = Character.toUpperCase(leer.next().charAt(0));
                if (resp == 'S') {
                        leer.nextLine(); //Limpiamos buffer del System.in
                        for (int i = 0; i < N; i++) {
                                System.out.print((i + 1) + "°_ ");
                                miBiblioteca[i].MostrarLibro();
                                System.out.println("\n\t\tPresione una tecla para continuar...");
                                leer.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
                        }
                }

        }
}
