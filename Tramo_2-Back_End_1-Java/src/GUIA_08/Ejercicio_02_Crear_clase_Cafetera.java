/*
2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadM?xima (la cantidad m?xima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vac?o y con
par?metros as? como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) M?todo llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad m?xima.
b) M?todo servirTaza(int): se pide el tama?o de una taza vac?a, el
m?todo recibe el tama?o de la taza y simula la acci?n de servir la
taza con la capacidad indicada. Si la cantidad actual de café ?no
alcanza? para llenar la taza, se sirve lo que quede. El m?todo le
informar? al usuario si se llen? o no la taza, y de no haberse llenado
en cuanto qued? la taza.
c) M?todo vaciarCafetera(): pone la cantidad de café actual en cero.
d) M?todo agregarCafe(int): se le pide al usuario una cantidad de café,
el m?todo lo recibe y se a?ade a la cafetera la cantidad de café
indicada.
 */

package GUIA_08;

import GUIA_08_ENTIDADES.Cafetera;
import GUIA_08_SERVICIOS.CafeteraServicio;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class Ejercicio_02_Crear_clase_Cafetera {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafetera1 = cs.crearCafetera();
        
        int tazaAux;
        
        System.out.print("Ingrese el tamaño de la taza a servir: ");
        tazaAux = leer.nextInt();
        cs.servirTaza(tazaAux,cafetera1);
        System.err.println(cafetera1.getCantidadActual());
        
        System.out.print("¿Cuánto café querés agregarle a la cafetera? ");
        int sumarcafe = leer.nextInt();
        cs.agregarCafe(sumarcafe, cafetera1);
        System.err.println(cafetera1.getCantidadActual());
        
        cs.vaciarCafetera(cafetera1);
        System.err.println(cafetera1.getCantidadActual());
        
        cs.llenarCafetera(cafetera1);
        System.err.println(cafetera1.getCantidadActual());
        
         }
}
