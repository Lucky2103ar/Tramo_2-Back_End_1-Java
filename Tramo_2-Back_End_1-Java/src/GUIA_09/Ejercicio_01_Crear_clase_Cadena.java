/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_09;

import GUIA_09_SERVICIOS.CadenaServicio;
import GUIA_09_ENTIDADES.Cadena;
import java.util.Scanner;

/**
 * Lucky2103ar
 */
public class Ejercicio_01_Crear_clase_Cadena {

        public static void main(String[] args) {
                Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
                Scanner leerChar = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
                CadenaServicio cadserv = new CadenaServicio();
                Cadena cad = cadserv.crearCadena();

                System.out.println("La cantidad de vocales de la frase es: " + cadserv.mostrarVocales(cad));

                System.out.println("La frase invertida es: " + cadserv.invertirFrase(cad));

                System.out.print("Ingrese la letra a buscar: ");
                char letra = leerChar.next().charAt(0); // forma para leer un único caracter del teclado ignorando el resto de lo que pueda escribir el usuario.
                System.out.println("El carácter \"" + letra + "\" se repite " // la \ hace que las " se vuelvan carácter imprimible. Tambien se utiliza con otros carácteres, con otros resultados.
                        + cadserv.vecesRepetido(cad, String.valueOf(letra)) + " veces."); // al ser letra de tipo char, lo tengo que convertir a String. Por que es lo que espera la función. 

                System.out.print("Ingrese una frase para comparar: ");
                String frase = leer.nextLine();
                int x = cadserv.compararLongitud(cad, frase);
                if (x == 0) {
                        System.out.println("si son iguales");
                } else if (x < 0) {
                        System.out.println("la cadena del objeto es menor");
                } else {
                        System.out.println("la cadena del objeto es mayor");
                }

                cadserv.unirFrases(cad, frase); // usa a misma frase ya ingresada para comparar longitud.

                System.out.print("Ingrese una nueva letra: ");
                letra = leerChar.next().charAt(0);
                cadserv.reemplazar(cad, String.valueOf(letra));

                System.out.print("Ingrese una nueva letra: ");
                letra = leerChar.next().charAt(0);

                if (cadserv.contiene(cad, String.valueOf(letra))) {
                        System.out.println("La letra buscada SI está dentro de la frase.");
                } else {
                        System.out.println("La letra buscada NO está dentro de la frase.");
                }

        }
}
