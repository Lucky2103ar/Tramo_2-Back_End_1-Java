/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_07_ENTIDADES;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    
    // Constructores

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Creamos el método
    public void crearEmpleado() {
      Scanner leer = new Scanner(System.in);
      // Pedimos al usuario los datos
      System.out.println("Ingrese el nombre del empleado:");
      nombre = leer.next();
      System.out.println("Ingrese la edad del empleado: ");
      edad = leer.nextInt();
      System.out.println("Ingrese el salario actual: ");
      salario = leer.nextDouble();
        
    }
    
    public void calcular_aumento(){
        if (edad>=30) {
            System.out.println("El empleado recibirá $" +(salario*0.10) + " de aumento");
            
        } else if (edad<30) {
            System.out.println("El empleado recibirá $" +(salario*0.05) + " de aumento");
        }
    }
}
