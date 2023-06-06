/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_08;

import GUIA_08_ENTIDADES.NIF;
import GUIA_08_SERVICIOS.NIFService;

/**
 *
 * @author Miguel ?ngel
 */
public class Extra_02_Crear_clase_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService nf = new NIFService();
        NIF n = nf.crearNif();
       
        nf.mostrar(n);
    }
    
}
