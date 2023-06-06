/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA_08_ENTIDADES;

/**
 *
 * @author Miguel Ángel
 */
public class NIF {
    
    private Long DNI;
    private String DV;

    public NIF() {
    }

    public NIF(Long DNI, String DV) {
        this.DNI = DNI;
        this.DV = DV;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }
    
}
