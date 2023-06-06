package GUIA_03;

/**
 * @author Lucky2103ar
* */

import java.util.Scanner;

public class Ejercicio_02_Verificar_frase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {   System.out.println("¡Correcto!");   }
          else {    System.out.println("Incorrecto.");  }
    }
}
