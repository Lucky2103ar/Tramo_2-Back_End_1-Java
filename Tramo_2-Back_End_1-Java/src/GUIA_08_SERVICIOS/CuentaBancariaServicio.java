/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) M?todo para crear cuenta pidi?ndole los datos al usuario.
b) M?todo ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) M?todo retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirar? el m?ximo posible hasta dejar la cuenta en 0.
d) M?todo extraccionRapida: le permitir? sacar solo un 20% de su saldo.
Validar que el usuario no saque m?s del 20%.
e) M?todo consultarSaldo: permitir? consultar el saldo disponible en la
cuenta.
f) M?todo consultarDatos: permitir? mostrar todos los datos de la
cuenta.
 */

package GUIA_08_SERVICIOS;

import GUIA_08_ENTIDADES.CuentaBancaria;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1");

    public CuentaBancaria crearCuenta() {
        System.out.print("Ingrese numero de cuenta: ");
        Integer numeroCuenta = leer.nextInt();
        
        System.out.print("Ingrese su DNI: ");
        Long dniCliente = leer.nextLong();
        
        System.out.print("Ingrese el monto a depositar ");
        Double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cb) {
        System.out.print("Ingrese el monto a depositar: ");
        Double dinero = leer.nextDouble();
        //        SA = SA + dinero;
        cb.setSaldoActual( cb.getSaldoActual() + dinero );
    }

    public void retirar(CuentaBancaria cb) {
        System.out.println("¿Cuánto dinero desea retirar?");
        Double retiroDinero = leer.nextDouble();
        if (cb.getSaldoActual() >= retiroDinero) {
            //        SA = SA - retiroDinero;
            cb.setSaldoActual( cb.getSaldoActual() - retiroDinero );
        } else {
            System.out.println("Fondos Insuficientes. Se entregará el saldo Actual.");
            cb.setSaldoActual(0.0);
        }
    }

    public void extraccionRapida(CuentaBancaria cb) {
        System.out.println("¿Cuánto dinero desea retirar?");
        Double retiroDinero = leer.nextDouble();
        if (cb.getSaldoActual() * 0.2 >= retiroDinero) {
            cb.setSaldoActual(cb.getSaldoActual() - retiroDinero);
        } else {
            System.out.println("Superó el 20%. ");
        }
    }

    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es: " + cb.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cb) {
        System.out.println(cb.toString());
    }
    
}
