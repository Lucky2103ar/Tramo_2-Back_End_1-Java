/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07_ENTIDADES;

/**
* Lucky2103ar
*/
public class Ascensor {
   private int pisoActual;
   private int maximoPisos;

    public Ascensor() {
    }

    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
   
   public void subir(){
    if (pisoActual<maximoPisos){
        pisoActual++;
    }
        
}
   
   public void bajar(){
    if(pisoActual>0){
        pisoActual--;
        
    }
}
   public void irA(int pisoDestino){
       if(pisoDestino>pisoActual){
           System.out.println("Piso Actual:" + pisoActual );
           subir();
           irA(pisoDestino);
           
       }else if(pisoDestino<pisoActual){
           System.out.println("Piso Actual:" + pisoActual );
           bajar();
           irA(pisoDestino);

        }else{
           System.out.println("Piso Actual:" + pisoActual );
           System.out.println("Lleg? a su destino.");
       }
           
   }
   
}