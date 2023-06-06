package GUIA_04;

import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/
 
public class Ejercicio_02_Nom_y_Edad_de_N_pers {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el numero de personas ");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
           //llamado funcion 
           pedir_datos();
            System.out.print("Desea seguir ingresando SI/NO ");
            String caracter = sc.next();
            if (caracter.equalsIgnoreCase("NO")) {
                i=cantidad;
            }
            
        }
    }
public static void pedir_datos(){
  Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre ");
        String nombre = sc.next();
         System.out.print("Ingrese la edad ");
        int edad = sc.nextInt();
        if (edad>=18) {
        System.out.println("El nombre es "+ nombre + " y su edad es " +edad + " ES MAYOR" );
    }else{
        System.out.println("El nombre es "+ nombre + " y su edad es " +edad +" ES MENOR");
        }
}    
    
}