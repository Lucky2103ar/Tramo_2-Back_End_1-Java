/*
Clase Date
4. Vamos a usar la clase Date que ya existe en Java.

Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */
package GUIA_09;

import GUIA_09_SERVICIOS.FechaService;
import java.util.Date;

/*
 * Lucky2103ar
 */
public class Ejercicio_04_Crear_claseServicio_FechaService {

        public static void main(String[] args) {
                FechaService fs = new FechaService();
                System.out.println("             VAMOS A CALCULAR SU EDAD");
                System.out.println("            ===========================");
                Date date = fs.fechaNacimiento();
                System.out.println("Su edad es: " + fs.diferencia( date , fs.fechaActual() ) + " años");
                
//                System.out.println(date.toString());
//                System.out.println(fs.diferencia(date, fs.fechaActual()));
        }

}
