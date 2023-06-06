/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_08;

import GUIA_08_ENTIDADES.Raices;
import GUIA_08_SERVICIOS.RaicesServicio;

/**
 *
 * @author Miguel ?ngel
 */
public class Extra_01_Crear_clase_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio rs = new RaicesServicio();
        Raices ec = rs.crearEc();
        rs.calcular(ec);
    }
    
}
