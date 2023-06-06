/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_05;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Lucky2103
 **/

public class Ejercicio_03_Contar_digitos_de_un_vector {
    public static void main(String[] args) {
        int n,cont=0, n2,uni=0,dec=0,cen=0,umil=0,dmil=0;
        Random random = new Random();
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el numero N dimension del vector");  
        n = leerNum.nextInt();
        int [] vector=new int [n];  
       
        for (int i = 0; i < n; i++) {
        vector[i] = random.nextInt(99999) + 1;    
        }
        
         for (int i = 0; i < n; i++) {
            n2=vector[i];
            cont=0;
             do {                 
             n2= Math.floorDiv(n2,10);
                     cont++;
             } while (n2>0);
             switch (cont) {
                 case 1:
                     uni++;
                 break;  
                 case 2:
                 dec++;
                     break;
                 case 3:
                 cen++;
                     break;
                 case 4:
                     umil++;
                     break;
                 case 5:
                     dmil++;
                     break;
                 default:
                     throw new AssertionError();
             }
             

        }
        System.out.println("la cantidad de 1 cifra es " + uni);  
        System.out.println("la cantidad de 2 cifra es " + dec);
        System.out.println("la cantidad de 3 cifra es " + cen);
        System.out.println("la cantidad de 4 cifra es " + umil);
        System.out.println("la cantidad de 5 cifra es " + dmil);
    }

}
