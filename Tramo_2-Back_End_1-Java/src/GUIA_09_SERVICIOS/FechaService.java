/*
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
package GUIA_09_SERVICIOS;

import java.util.Date;
import java.util.Scanner;

/*
 * Lucky2103ar
 */
public class FechaService {

        private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

//b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date(); El método debe retornar el objeto Date.        
        public Date fechaActual() {
                return new Date(); // El constructor vacío inicializa al objeto con la fecha actual.
        }

//a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);    
        public Date fechaNacimiento() {
                Date fechaNac;
                int dia, mes, anio;
                boolean band;

                System.out.println("Ingrese su fecha de nacimiento.");
                do {
                        band = false;
                        System.out.print("Día: ");
                        dia = leer.nextInt();
                        System.out.print("Mes: ");
                        mes = leer.nextInt();
                        System.out.print("Año: ");
                        anio = leer.nextInt();

                        fechaNac = new Date(anio - 1900, mes - 1, dia); // Cuando se carga una fecha hay que restarle 1900 al año y 1 al mes.

                        // Valido si dia y mes son correctos. Y si la fecha ingresada es menor a la fecha actual.
                        switch (mes) {
                                case 2:
                                        if (esBisiesto(anio)) {
                                                band = 1 <= dia && dia <= 29 && fechaNac.before(fechaActual());
                                        } else {
                                                band = 1 <= dia && dia <= 28 && fechaNac.before(fechaActual());
                                        }
                                        break;
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                        band = 1 <= dia && dia <= 31 && fechaNac.before(fechaActual());
                                        break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                        band = 1 <= dia && dia <= 30 && fechaNac.before(fechaActual());
                                        break;
//                                default:
//                                        band = false;
                        }
                        if (!band) {
                                System.out.println("Ingrese una fecha de nacimiento válida.");
                        }
                } while (!band);
                return fechaNac;
        }

        /*
                              *Algoritmo para saber si el año es BISIESTO
                              =================================
        	Si anio MOD 100 == 0 Entonces
		Si anio MOD 400 == 0 Entonces
			Escribir "Es un año bisiesto."
		SiNo
			Escribir "NO es un año bisiesto."
		FinSi
	SiNo
		Si anio MOD 4 == 0 Entonces
			Escribir "Es un año bisiesto."
		SiNo
			Escribir "NO es un año bisiesto."
		FinSi
	FinSi
         */
        public boolean esBisiesto(int anio) {
                if (anio % 100 == 0) {
                        return (anio % 400 == 0);
                } else {
                        return (anio % 4 == 0);
                }
        }

        //        c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
        public int diferencia(Date fechaNac, Date fechaActual) {
                int diferenciaAnios = fechaActual.getYear() - fechaNac.getYear();
//                Date fechaAux = new Date(fechaActual.getYear(), fechaNac.getMonth(), fechaNac.getDay());
//                System.out.println(fechaAux);
                if ((fechaActual.getMonth() < fechaNac.getMonth()) || (fechaActual.getMonth() == fechaNac.getMonth() && fechaActual.getDay() < fechaNac.getDay())) {
                        diferenciaAnios--;
                }
//                System.out.println(fechaActual.getMonth() < fechaNac.getMonth() + " || " + fechaActual.getMonth() == fechaNac.getMonth() + " && " + fechaActual.getDay() < fechaNac.getDay());
//                System.out.println((fechaActual.getMonth() < fechaNac.getMonth()) || (fechaActual.getMonth() == fechaNac.getMonth() && fechaActual.getDay() < fechaNac.getDay()));

                return diferenciaAnios;
        }
}
