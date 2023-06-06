package GUIA_04;

import java.util.Scanner;

/**
 * @author Lucky2103ar
 **/

public class Ejercicio_11_Pag4 {
    public static void main(String[] args) {
        Scanner leerStr;
        leerStr = new Scanner(System.in, "ISO-8859-1");
        String palabra;
            
            System.out.print("Ingrese una palabra con caracteres especiales: ");
            palabra = leerStr.nextLine();
            
            System.out.println("La palabra ingresada es: " + palabra);
        }
    }


    /*
    public static void main(String[] args) {
        String palabra;
        Scanner leerStr = new Scanner(System.in, "UTF-8");
        
        System.out.println("Ingrese una secuencia de caracteres terminada en punto:");
        palabra = leerStr.nextLine();
        System.out.println(palabra);
        System.out.println(codificarPalabra(palabra));
    }
    
    public static String codificarPalabra(String frase){
        int i=0;
        String palabra = "";
      
        while (frase.charAt(i)!='.') {
            switch (frase.charAt(i)) {
                case 'A':
                case 'á':
                case 'a':   palabra = palabra.concat("@");  break;
                case 'é':
                case 'E':
                case 'e':   palabra = palabra.concat("#");  break;
                case 'í':
                case 'I':
                case 'i':   palabra = palabra.concat("$");  break;
                case 'ó':
                case 'O':
                case 'o':   palabra = palabra.concat("%");  break;
                case 'ú':
                case 'U':
                case 'u':   palabra = palabra.concat("*");  break;
                default:    palabra = palabra.concat( Character.toString( frase.charAt(i) ) );
            }
            i++;
        }
        palabra = palabra.concat("."); 
        return palabra;
    }
}

*/