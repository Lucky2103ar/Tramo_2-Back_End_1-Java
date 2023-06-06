/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_03;
import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/

public class Ejercicio_05_Valor_limite {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un valor límite positivo: ");
        int limite = leer.nextInt();
        
        int suma = 0;
        while (suma <= limite) {
            System.out.print("Ingresa un número: ");
            int num = leer.nextInt();
            suma += num;
        }
        
        System.out.println("La suma total es: " + suma);
    }
}
