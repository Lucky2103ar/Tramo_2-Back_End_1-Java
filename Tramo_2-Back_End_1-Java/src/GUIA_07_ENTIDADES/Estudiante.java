/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIA_07_ENTIDADES;

/**
* Lucky2103ar
*/

    import java.util.Scanner;

public class Estudiante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private double notaMedia;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void calcularNota() {
        //calcular la nota media de un grupo de estudiantes. 
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantE = leer.nextInt();
        String estudiantes[] = new String[cantE];
        Double promedio[] = new Double[cantE];

        for (int i = 0; i < cantE; i++) {
            estudiantes[i] = leer.nextLine();
            System.out.println("Ingrese el nombre: ");
            estudiantes[i] = leer.nextLine();
            System.out.println("Ingrese el edad: ");
            edad = leer.nextInt();
            System.out.println("Ingrese la nota: ");
            promedio[i] = leer.nextDouble();
            notaMedia += promedio[i];
        }
        notaMedia /= cantE;
        System.out.println("La nota media de los estudiantes es: " + notaMedia);
        for (int i = 0; i < cantE; i++) {
            if (promedio[i] > notaMedia) {
                System.out.println("Estudiante: " + estudiantes[i] + "Tiene una nota media superior.");
            }

        }
    }

}
