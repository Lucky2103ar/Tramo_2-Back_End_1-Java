/*
2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMaxima (la cantidad m?xima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vac?o y con
par?metros as? como setters y getters.
 */

package GUIA_08_ENTIDADES;

/**
* Lucky2103ar
*/
public class Cafetera {
    
    // ATRIBUTOS
    private Integer capacidadMaxima;
    private Integer cantidadActual;
    
    // CONSTRUCTORES

    public Cafetera() {
    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    // SETTERS

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    // GETTERS

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }
    
}
