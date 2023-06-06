/*
Crear clase CafeteraServicio en
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

package GUIA_08_SERVICIOS;

import GUIA_08_ENTIDADES.Cafetera;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1");
    
    public Cafetera crearCafetera(){
        System.out.print("¿Qué cafetera va a usar hoy? ");
        int capmax = leer.nextInt();
        System.out.print("¿Hasta dónde la vas llenar? ");
        int capact = leer.nextInt();
        return new Cafetera(capmax,capact);
    }
    
    public void llenarCafetera(Cafetera lechera){
        // CA = CM
        lechera.setCantidadActual(lechera.getCapacidadMaxima()); 
    }
    
    public void servirTaza(int capacidadTaza, Cafetera lechera){
        if (capacidadTaza > lechera.getCantidadActual() ) {
            System.out.println("No alcanzó a llenarse la taza. Solo quedaba " + lechera.getCantidadActual() + "ml de café." );
            lechera.setCantidadActual(0);
        } else {
            System.out.println("Se llenó su taza, por favor retire la misma.");
            // CA = CA - capacidadTaza
            lechera.setCantidadActual(lechera.getCantidadActual()-capacidadTaza);
        }
    }

    public void vaciarCafetera(Cafetera lechera){
        lechera.setCantidadActual(0);
    }
    
    public void agregarCafe(int aumentarCafe, Cafetera lechera){
        if (lechera.getCantidadActual()+aumentarCafe > lechera.getCapacidadMaxima()) {
            System.out.println("No se puede realizar la acción, pues la cafetera se va a rebalsar.");
        } else {
            // CA = CA + aumentarCafe
            lechera.setCantidadActual(lechera.getCantidadActual() + aumentarCafe);
        }        
    }
    
    
}
