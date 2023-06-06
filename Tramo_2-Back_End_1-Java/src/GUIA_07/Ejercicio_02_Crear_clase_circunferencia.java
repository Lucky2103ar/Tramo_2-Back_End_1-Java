/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07;

import GUIA_07_ENTIDADES.Circunferencia;

/**
 * @Lucky2103ar
 */
public class Ejercicio_02_Crear_clase_circunferencia {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        c.crearCircunferencia ();
        System.out.println (c.getRadio());
        System.out.println ( "Area: "+c.area());
        System.out.println ("Perimetro: "+ c.perimetro());
    }
}
