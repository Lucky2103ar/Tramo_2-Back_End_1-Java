/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:

d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package GUIA_09_SERVICIOS;

import GUIA_09_ENTIDADES.Persona;
import GUIA_09_SERVICIOS.FechaService;
import java.util.Date;
import java.util.Scanner;

/*
* Lucky2103ar
 */
public class PersonaService {

        private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        private FechaService fs = new FechaService();

//        a) Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
        public Persona crearPersona() {
                System.out.print("Ingrese el nombre de la persona: ");
                String nombre = leer.nextLine();
                Date fechaDeNacimiento = fs.fechaNacimiento();
                return new Persona(nombre, fechaDeNacimiento);
        }

//        b) Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
        public int calcularEdad(Date fechaNac) {
                return fs.diferencia(fechaNac, fs.fechaActual());
        }

//        c) Método menorQue recibe como parámetro una Persona y una edad.
//        Retorna true si la persona es menor que la edad consultada o false en caso contrario.  
        public boolean menorQue(Persona persona, int edad) {
                return calcularEdad(persona.getFechaDeNacimiento()) < edad;
        }

//    d) Método mostrarPersona que muestra la información de la persona deseada.
        public void mostrarPersona(Persona persona) {
                System.out.println("\n==========================================");
                System.out.println("    El nombre de la persona es: " + persona.getNombre());
                System.out.println("    Su fecha de nacimiento es: " + persona.getFechaDeNacimiento());
                System.out.println("    Su edad es: " + calcularEdad(persona.getFechaDeNacimiento()) + " años");
                System.out.println("    Podrá votar: " + !menorQue(persona, 16));
                fs.diferencia(persona.getFechaDeNacimiento(), fs.fechaActual());
        }
}
