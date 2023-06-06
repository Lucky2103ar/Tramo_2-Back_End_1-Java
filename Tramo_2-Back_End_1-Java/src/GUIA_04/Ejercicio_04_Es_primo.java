package GUIA_04;

import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/

public class Ejercicio_04_Es_primo {
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = leerNum.nextInt();
        if (esPrimo(numero)) {  System.out.println("El número ingresado es primo.");    }
          else {  System.out.println("El número ingresado NO es primo.");  }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {  return false;   }   //Los número negativos, el 0 y el 1 no son números primos.
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {  return false;   }   //Si es divisible en cualquier otro número tampoco es primo.
        }
        return true;
    }
}
