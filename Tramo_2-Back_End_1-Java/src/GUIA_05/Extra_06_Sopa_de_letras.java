/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_05;

import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Extra_06_Sopa_de_letras {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[][] sopa = new String[20][20];
        //Inicializo la MATRIZ
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "";
            }
        }

        String palabra;
        int f, c;
        
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra: ");
                palabra = leer.nextLine();
                if (palabra.length() < 3 || palabra.length() > 5) {
                    System.out.println("La palabra es inv?lida. Vuelva a intentarlo: ");
                }
            } while (palabra.length() < 3 || palabra.length() > 5);
            
            do{
                 f = (int) (Math.random() * 20);
            }while(sopa[f][0] != "");
            
            c = 0;
            while (c < palabra.length()) {
                sopa[f][c] = palabra.substring(c, c+1);
                c++;
            }
            while (c < 20) {
                sopa[f][c] = (int) (Math.random() * 10)+"";
                c++;
            }
        }
        
        for (int i = 0; i < 20; i++) {
            if (sopa[i][0] == ""){
                for (int j = 0; j < 20; j++) {
                    sopa[i][j] = (int) (Math.random() * 10)+"";
                }
            }
        }        
        
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
