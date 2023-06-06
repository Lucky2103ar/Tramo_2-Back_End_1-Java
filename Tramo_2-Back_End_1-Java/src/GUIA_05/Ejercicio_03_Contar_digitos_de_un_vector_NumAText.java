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

public class Ejercicio_03_Contar_digitos_de_un_vector_NumAText {
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de
        // 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
 
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño N del Vector: ");
        System.out.println(" ");
        int N = leer.nextInt();
        int vector[]= new int[N];
        
        Random numRandom = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numRandom.nextInt(100000 + 1);
            System.out.println("[" + vector[i] + "]");}
            System.out.println(" ");
       
        // Otro metodo
        // for (int i = 0; i <N; i++) {
        // vector[i] = (int) (Math.random()*99999+1);
        
        
        String numenText;
        int un_digito=0;
        int dos_digito=0;
        int tres_digito=0;
        int cuatro_digito=0;
        int cinco_digito=0;
    
        for (int i = 0; i < vector.length ; i++) {
            numenText= Integer.toString(vector[i]);
            switch (numenText.length()){
                case 1:
                    un_digito++;
                    break;
                case 2:
                    dos_digito++;
                    break;
                case 3:
                    tres_digito++;
                    break;
                case 4:
                    cuatro_digito++;
                    break;
                case 5:
                    cinco_digito++;
                    break;
            }
        }
        System.out.println("El vector tiene ");
        System.out.println(" ");
        System.out.println(un_digito + " cantidad de 1 digito");
        System.out.println(" ");
        System.out.println(dos_digito + " cantidad de 2 digitos");
        System.out.println(" ");
        System.out.println(tres_digito + " cantidad de 3 digitos");
        System.out.println(" ");
        System.out.println(cuatro_digito + " cantidad de 4 digitos");
        System.out.println(" ");
        System.out.println(cinco_digito + " cantidad de 5 digitos");
        System.out.println(" ");
    }
}
