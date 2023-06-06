/*
A continuaci?n, en la clase main hacer lo siguiente:
? Crear 4 objetos de tipo Persona con distintos valores, a continuaci?n,
llamaremos todos los m?todos para cada objeto, deber? comprobar si la
persona est? en su peso ideal, tiene sobrepeso o est? por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
? Por ?ltimo, guardaremos los resultados de los m?todos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para despu?s calcular un
porcentaje de esas 4 personas cuantas est?n por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y tambi?n calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos m?todos adicionales.
 */

package GUIA_08;

import GUIA_08_ENTIDADES.Persona;
import GUIA_08_SERVICIOS.PersonaServicio;
import java.util.Scanner;


/**
* Lucky2103ar
*/
public class Ejercicio_03_Crear_clase_Persona {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
                System.out.println(p1.toString());
        Persona p2 = ps.crearPersona();
                System.out.println(p2.toString());
        Persona p3 = ps.crearPersona();
                System.out.println(p3.toString());
        Persona p4 = ps.crearPersona();
                System.out.println(p4.toString());

        short[] imcs = new short[4];
        boolean[] edades = new boolean[4];

        imcs[0] = ps.calcularIMC(p1);
        imcs[1] = ps.calcularIMC(p2);
        imcs[2] = ps.calcularIMC(p3);
        imcs[3] = ps.calcularIMC(p4);
        
        edades[0] = ps.esMayorDeEdad(p1);
        edades[1] = ps.esMayorDeEdad(p2);
        edades[2] = ps.esMayorDeEdad(p3);
        edades[3] = ps.esMayorDeEdad(p4);
        
        int cbp = 0, cpi = 0, csp = 0, cmaye = 0 , cmene = 0;
        
        for (int i = 0; i < 4; i++) {
            if ( imcs[i] == -1 ) {   cbp++;  }
            else if ( imcs[i] == 0 ) {   cpi++;  }
            else {  csp++;  }
            
            if ( edades[i] ) {  cmaye++; }
            else{   cmene++;    }
        }
        
        System.out.println("Hay un " + (cbp * 100 / 4) + "% de personas que est?n por debajo de su peso.");
        System.out.println("Hay un " + (cpi * 100 / 4) + "% de personas que est?n en su peso ideal.");
        System.out.println("Hay un " + (csp * 100 / 4) + "% de personas que est?n por encima.");
        System.out.println("Hay un " + (cmaye * 100 / 4) + "% de personas mayores de edad.");
        System.out.println("Hay un " + (cmene * 100 / 4) + "% de personas menores de edad.");
    }
}
