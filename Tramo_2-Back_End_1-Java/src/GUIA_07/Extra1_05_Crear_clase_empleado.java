/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_07;

import GUIA_07_ENTIDADES.Empleado;
import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Extra1_05_Crear_clase_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado sueldo = new Empleado();
        
        sueldo.crearEmpleado();
        sueldo.calcular_aumento();
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingrese el Salario actual: ");
//        sueldo.setSalario(leer.nextDouble());
//        System.out.print("Ingrese la edad del empleado: ");
//        sueldo.setSalario(leer.nextDouble());
    }
    
}
