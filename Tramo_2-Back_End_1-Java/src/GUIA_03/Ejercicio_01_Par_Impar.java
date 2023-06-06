package GUIA_03;

/**
 * @author Lucky2103ar
 **/

import java.util.Scanner;

public class Ejercicio_01_Par_Impar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número entero: ");
        numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}
