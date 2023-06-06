/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07_ENTIDADES;

import java.util.Scanner;

/**
* Lucky2103ar
*/
public class Rectangulo {
    private int base;
    private int altura;

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresar el valor de la base: ");
        base = leer.nextInt();

        System.out.print("Ingresar el valor de la altura: ");
        altura = leer.nextInt();
    }

    public double superficie() {    return base * altura;   }

    public double perimetro() {     return (base + altura) * 2; }

    public int getBase() {  return base;    }

    public void setBase(int base) { this.base = base;   }

    public int getAltura() {    return altura;  }

    public void setAltura(int altura) { this.altura = altura;   }

    public Rectangulo() {   }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void getAltura(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public void dibujarRectangulo(){
         for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i ==0 || j == 0 || j==altura-1 || i==base-1) {  System.out.print("* "); }
                else {  System.out.print("  "); }
            }
            System.out.println("");
        }
    }

}
