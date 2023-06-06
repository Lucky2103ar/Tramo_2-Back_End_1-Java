/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_08_SERVICIOS;

import GUIA_08_ENTIDADES.NIF;
import java.util.Scanner;

/**
 *
 * @author Miguel ?ngel
 */
public class NIFService {
    public Scanner leer = new Scanner(System.in);
    
    private String[] vector = {"T","R","W","A","E","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    //b)
    public NIF crearNif(){
        long dni;
        do {
            System.out.print("Ingrese el Número de DNI: ");
            dni = leer.nextLong();
            if (dni<1000000) {
                System.err.println("Ingrese un DNI válido");
            }
        } while (dni<1000000);
        
        
        //tomar el resto de la /
        int resto = (int) dni%23;
        return new NIF(dni,vector[resto]);
    }
    //c)
    public void mostrar(NIF nif){
        if (nif.getDNI()<10000000) {
            System.out.println("0" + nif.getDNI() + "-" + nif.getDV());
        } else {
        System.out.println(nif.getDNI() + "-" + nif.getDV());
        }
    
    }
}