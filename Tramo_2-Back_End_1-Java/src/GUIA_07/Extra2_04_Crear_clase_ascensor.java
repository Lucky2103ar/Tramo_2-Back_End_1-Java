/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07;

import GUIA_07_ENTIDADES.Ascensor;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class Extra2_04_Crear_clase_ascensor {
    public static void main(String[] args) {
        Ascensor a1 = new Ascensor(0, 10);
        Scanner leer = new Scanner(System.in);
        int pisoDestino;
        do {
            System.out.println("?A qu? piso desea ir?");
            pisoDestino = leer.nextInt();
            if (pisoDestino < 0 || pisoDestino > 10) {
                System.out.println("Piso Inexistente.");
                break;
            }
            a1.irA(pisoDestino);
        } while (pisoDestino >= 0 && pisoDestino <= 10);
    }
}
