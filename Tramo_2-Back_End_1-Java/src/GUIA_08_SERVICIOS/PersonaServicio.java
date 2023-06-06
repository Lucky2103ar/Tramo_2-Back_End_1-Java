/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
m?todos:
a) M?todo esMayorDeEdad(): indica si la persona es mayor de edad. La
funci?n devuelve un booleano.
b) Metodo crearPersona(): el m?todo crear persona, le pide los valores
de los atributos al usuario y despu?s se le asignan a sus respectivos
atributos para llenar el objeto Persona. Adem?s, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deber? mostrar un mensaje
c) M?todo calcularIMC(): calculara si la persona est? en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta f?rmula da por resultado un
valor menor que 20, significa que la persona est? por debajo de su
peso ideal y la funci?n devuelve un -1. Si la f?rmula da por resultado
un n?mero entre 20 y 25 (incluidos), significa que la persona est? en
su peso ideal y la funci?n devuelve un 0. Finalmente, si el resultado
de la f?rmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la funci?n devuelve un 1.
 */

package GUIA_08_SERVICIOS;

import GUIA_08_ENTIDADES.Persona;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class PersonaServicio {
//    private Scanner leerNum= new Scanner(System.in, "ISO-8859-1");
//    private Scanner leerStr = new Scanner(System.in, "ISO-8859-1");
    Scanner leer = new Scanner(System.in /*, "ISO-8859-1"*/ ).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona tipo) {
        return tipo.getEdad() > 18;
    }
    
    public Persona crearPersona() {
        System.out.print("Ingrese el nombre completo de la persona: ");
        String nom = leer.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        String sexo;
        do {
            System.out.print("Ingrese el sexo de la persona (M/H/O): ");
            sexo = leer.next();
            if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("o"))) {
                System.out.println("Opci?n incorrecta...");
            }
        } while (!(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("o")));
        System.out.print("Ingrese el peso de la persona en kilogramos: ");
        float peso = leer.nextFloat();
        float altura;
        do {
            System.out.print("Ingrese la altura de la persona en cent?metros: ");
            altura = leer.nextFloat();
        } while (altura <= 0);
        return new Persona(nom, edad, sexo, peso, altura);
    }
    
    public short calcularIMC(Persona tipo){
        float IMC = (float) (tipo.getPeso() / Math.pow(tipo.getAltura() / 100 , 2));
        if ( IMC < 20 ) {
            return -1;
        } else if ( IMC >= 20 && IMC <= 25) {
          return  0;
       } else {
            return 1;
        }
    }

}
