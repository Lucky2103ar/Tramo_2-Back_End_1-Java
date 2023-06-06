/*
1. Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vac?o, con par?metros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) M?todo para crear cuenta pidi?ndole los datos al usuario.
b) M?todo ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumar? al saldo actual.
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

package GUIA_08;

import GUIA_08_ENTIDADES.CuentaBancaria;
import GUIA_08_SERVICIOS.CuentaBancariaServicio;
import java.util.Scanner;

/**
* Lucky2103ar
*/
public class Ejercicio_01_Crear_Clase_CuentaBancaria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio Persona1 = new CuentaBancariaServicio();
        System.out.println("Bienvenido a Banco la Nacion");
        System.out.println("Porfavor cree su cuenta bancaria");
        CuentaBancaria Cuenta1 = Persona1.crearCuenta();
        System.out.println(
                "OPCION 1 = Ingresar dinero \n"
                + "OPCION 2 = Retirar dinero \n"
                + "OPCION 3 = Retirar dinero Extracci?n r?pida \n"
                + "OPCION 4 = Consultar saldo \n"
                + "OPCION 5 = Consultar datos  \n"
                + "OPCION 6 = Salir");
        int var;
        do {
            System.out.println("Ingrese una opcion : ");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    Persona1.ingresar(Cuenta1);
                    break;
                case 2:
                    Persona1.retirar(Cuenta1);
                    break;
                case 3:
                    Persona1.extraccionRapida(Cuenta1);
                    break;
                case 4:
                    Persona1.consultarSaldo(Cuenta1);
                    break;
                case 5:
                    Persona1.consultarDatos(Cuenta1);
                    break;
                case 6:
                    System.out.println("Adios... vuelva pronto.");
            }
        } while (var != 6);
    }
}

//
//    public static void main(String[] args) {
//        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
//        CuentaBancaria cb1 = cbs.crearCuenta();
//
//        cbs.extraccionRapida(cb1);
//        cbs.consultarSaldo(cb1);
//        
//        cbs.retirar(cb1);
//        cbs.consultarSaldo(cb1);
//        
//        cbs.ingresar(cb1);
//        
//        cbs.consultarDatos(cb1);
//
//    }
//
//}
