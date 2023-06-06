/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_09;

import GUIA_09_ENTIDADES.ParDeNumeros;
import GUIA_09_SERVICIOS.ParDeNumerosService;

/**
 * Lucky2103ar
 */
public class Ejercicio_02_Crear_clase_ParDeNumeros {

        public static void main(String[] args) {
                ParDeNumerosService numsServ = new ParDeNumerosService();
                ParDeNumeros nums = new ParDeNumeros();

                numsServ.mostrarValores(nums);
                System.out.println("El número mayor es: " + numsServ.devolverMayor(nums));
                System.out.println("El número menor es: " + numsServ.devolverMenor(nums));
                System.out.println("La potencia del mayor elevada al menor es: " + numsServ.calcularPotencia(nums));
                System.out.println("La raíz cuadra del menor es: " + numsServ.calculaRaiz(nums));
        }
}
