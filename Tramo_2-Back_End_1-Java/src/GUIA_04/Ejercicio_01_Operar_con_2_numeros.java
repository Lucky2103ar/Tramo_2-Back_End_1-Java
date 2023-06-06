package GUIA_04;

/**
 * @author Lucky2103ar
 **/

import java.util.Scanner;

public class Ejercicio_01_Operar_con_2_numeros {
 public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        Scanner leerChar = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double n1 = leerNum.nextInt();
        System.out.print("Ingrese otro número: ");
        double n2 = leerNum.nextInt();
        int opc;
        double cuenta;
        boolean salir = true;
        
        do {
            cuenta = 0;
            System.out.println("");
            System.out.println("¿Qué desea hacer?"); 
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            System.out.print("              Ingrese su opción: ");
            opc = leerNum.nextInt();
                                
            switch (opc) {
                
                case 1: System.out.println("\nLa suma de ambos números es: " + sumar(n1,n2)); break;
                
                case 2: System.out.println("\nLa resta de ambos números es: " + restar(n1,n2));   break;
                
                case 3: System.out.println("\nEl producto de ambos números es: " + multiplicar(n1,n2));   break;
                
                case 4: System.out.println("\nEl cociente de ambos números es: " + dividir(n1,n2));   break;
                
                case 5:
                    System.out.println("              ¿Desea salir? S/N: ");
                    String SN = leerChar.next();
                    if (SN.equalsIgnoreCase("S")) {  salir = false;   }
                    break;

                default:
                    System.out.println("El valor ingresado no es válido.");
            }
            
            System.out.println("\nPresione cualquier tecla para continuar...");   leerChar.nextLine();
        } while (salir);
        
    }
    

public static double sumar(double n1,double n2){
    double suma = n1 + n2;
return suma;
}
public static double restar(double n1,double n2){
    double resta = n1 - n2;
return resta;
}
public static double multiplicar(double n1,double n2){
    double prod = n1 * n2;
return prod;
}
public static double dividir(double n1,double n2){
    double div = n1 / n2;
return div;
}
}