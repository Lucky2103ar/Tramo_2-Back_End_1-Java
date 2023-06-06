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
public class Libro {
//    ATRIBUTOS
     private String ISBN;   //El ISBN se compone de trece d?gitos agrupados en cinco elementos, que deben estar separados por guiones.
     private String Titulo;
     private String Autor;
     private Integer numPag;

    public Libro() {    }

    public Libro(String ISBN, String Titulo, String Autor, Integer numPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPag = numPag;    }
     
    public void CargarLibro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        System.out.println("INGRESE LOS DATOS DEL LIBRO A CARGAR");
        System.out.println("=====================================");
        System.out.print("Ingrese el ISBN: ");
        ISBN = leer.nextLine();
        System.out.print("Ingrese el T?tulo: ");
        Titulo = leer.nextLine();
        System.out.print("Ingrese el Autor: ");
        Autor = leer.nextLine();
        System.out.print("Ingrese el N?mero de p?ginas: ");
        numPag = leer.nextInt();    }
    
    public void MostrarLibro(){
        System.out.println("ESTOS SON LOS DATOS DEL LIBRO CARGADO");
        System.out.println("=======================================");
        System.out.println("ISBN: " + ISBN);
        System.out.println("T?tulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("N?mero de p?ginas: " + numPag);    }
}
     
