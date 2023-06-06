/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_09;

import GUIA_09_ENTIDADES.Meses;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Extra_01_JuegoMesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Meses mesSecreto = new Meses();
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String mesUsuario;
        do { 
            mesUsuario = leer.next();
            if (mesSecreto.adivinarMes(mesUsuario)) {
                System.out.println("Ha acertado!! ");
            } else {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while(!mesSecreto.adivinarMes(mesUsuario));
    }
}
