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
public class Cuenta {
    private double saldo;
    private String titular;
    // Constructores

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    // Creamos el método retirar efectivo
    public void retirar_efectivo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de efectivo a retirar: ");
        double retiro = leer.nextDouble();
        if ((saldo - retiro) < 0) {
            System.err.println("Fondo insuficiente");
            
        } else {
            saldo -= retiro;
            System.out.println("En su cuenta queda: $" + saldo );
        }
        
        
    }
}
