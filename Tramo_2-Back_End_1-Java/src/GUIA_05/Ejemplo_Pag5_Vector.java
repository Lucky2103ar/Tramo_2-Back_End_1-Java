/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_05;

/**
 * @author Lucky2103
 **/

public class Ejemplo_Pag5_Vector {
    public static void main(String[] args) {
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        // Puedo asignar valores de esta manera
        vector[0] = 3;
        // Asigno valores mediante el for
        for (int i = 0; i < 5; i++) {
            vector[i] = i + 3;
        }
        // Muestro el vector
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }
}
