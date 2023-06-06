/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario.
 */

package GUIA_07;

import GUIA_07_ENTIDADES.Operacion;
import java.util.Scanner;

/**
 * @Lucky2103ar
 */
public class Ejercicio_03_Crear_clase_operacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion op = new Operacion(); // Crear objeto Operacion sin atributos
//        op.crearOperacion(); // Pide al usuario los dos números y los guarda en los atributos del objeto
        op.crearOperacion(); // Mensaje pidiendo al usuario los dos números
//        float num1 = leer.nextFloat();
//        float num2 = leer.nextFloat();
        op.setNum1(leer.nextDouble());
        op.setNum2(leer.nextDouble());
        System.out.println("La suma de: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.sumar());
        System.out.println("La resta es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.restar());
        
        if(op.getNum1() == 0 || op.getNum2() == 0){              System.err.println("No se puede realizar multiplicaciones con 0");  }
        else{        System.out.println("La multiplicación es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.multiplicar());    }
        if(op.getNum2() == 0){                 System.err.println("No se puede realizar divsiones en 0");   }   
        else{   System.out.println("La división es: " + op.getNum1() + " y " + op.getNum2() + " es: "+ op.dividir());   }
    }

}
