/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_07;

import GUIA_07_ENTIDADES.Cuenta;
import java.util.Scanner;


/**
 *
 * @author Miguel Ángel
 */
public class Extra1_04_Crear_clase_cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta_ahorro = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.print("Cargue el saldo de la cuenta: ");
        cuenta_ahorro.setSaldo(leer.nextDouble());
        String opcion;
        do {
            cuenta_ahorro.retirar_efectivo();
            System.out.print("Desa seguir operando?");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("Si")|| opcion.equalsIgnoreCase("S"));
        
    }
    
}
