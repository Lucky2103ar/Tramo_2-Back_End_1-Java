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

public class Ejercicio_06_Operar_con_2_numeros {
    public static void limpiarPantalla() {  for (int i = 0; i < 10; ++i) System.out.println();  }
    public static void main(String[] args) throws InterruptedException {
    Scanner leernum = new Scanner(System.in);
    Scanner leerchar = new Scanner(System.in);
    Scanner wait = new Scanner(System.in);

    System.out.print("Ingrese el primer numero: ");
        int num1 = leernum.nextInt();
    System.out.print("Ingrese el segundo numero: ");
        int num2 = leernum.nextInt();
        
        
    boolean repetir = true;
    do {
        limpiarPantalla();
        System.out.println("   Menu");
        System.out.println("   ====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir\n");
        System.out.print("Elija una opcion: ");
            int opcion = leernum.nextInt();
            
        switch (opcion) {
            case 1: 
                System.out.println("\nLa suma de los 2 numeros es: " + (num1 + num2) );
                System.out.println("                        Presiona cualquier tecla para continuar...");
                wait.nextLine(); // Espera hasta que el usuario presione enter
                //Thread.sleep(2000); //Espera 2 segundos
                break;
            case 2:
                System.out.println("\nLa resta de los 2 numeros es: " + (num1 - num2) );
                System.out.println("                        Presiona cualquier tecla para continuar...");
                wait.nextLine(); // Espera hasta que el usuario presione enter
                //Thread.sleep(2000); //Espera 2 segundos
                break;
            case 3: 
                System.out.println("\nLa multiplicacion de los 2 numeros es: " + (num1 * num2) );
                System.out.println("                        Presiona cualquier tecla para continuar...");
                wait.nextLine(); // Espera hasta que el usuario presione enter
                //Thread.sleep(2000); //Espera 2 segundos
                break;
            case 4:
                System.out.println("\nLa division de los 2 numeros es: " + (num1 / num2) );
                System.out.println("                        Presiona cualquier tecla para continuar...");
                wait.nextLine(); // Espera hasta que el usuario presione enter
                //Thread.sleep(2000); //Espera 2 segundos
                break;
            case 5:
                System.out.print("\nEsta seguro que quiere salir S/N: ");
                    String resp = leerchar.next();
                if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("s")){  repetir = false;    }   break;   
            default:
                System.out.println("                      Opcion incorrecta");
                System.out.println("                        Presiona cualquier tecla para continuar...");
                wait.nextLine(); // Espera hasta que el usuario presione enter
                //Thread.sleep(2000); //Espera 2 segundos
        }  
    } while(repetir);
    
    }
}
