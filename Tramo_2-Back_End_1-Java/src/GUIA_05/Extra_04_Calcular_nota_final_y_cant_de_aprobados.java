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

public class Extra_04_Calcular_nota_final_y_cant_de_aprobados {
    public static void main(String[] args) {
        
        int aprobados=0,desaprobados=0;
        double[] vector = new double[10];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = notaFinal(i);
            if (vector[i] >= 7) {
                aprobados++;
            } else { 
                desaprobados++; 
            }
        }
        
        mostrar(vector);
        
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + desaprobados);

    }
    
    public static double notaFinal(int i) {
        double nota,n1,n2,n3,n4;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del primer TP evaluativo del " + (i+1) + "º alumno: ");
        n1 = leer.nextDouble();
        System.out.println("Ingrese la nota del segundo TP evaluativo del " + (i+1) + "º alumno: ");
        n2 = leer.nextDouble();
        System.out.println("Ingrese la nota del primer integrador del " + (i+1) + "º alumno: ");
        n3 = leer.nextDouble();
        System.out.println("Ingrese la nota del segundo integrador del " + (i+1) + "º alumno: ");
        n4 = leer.nextDouble();
        
        nota = n1 * 0.1 + n2 * 0.15 + n3 * 0.25 + n4 * 0.5;
        
        return nota;
    }
    
     public static void mostrar(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
}
