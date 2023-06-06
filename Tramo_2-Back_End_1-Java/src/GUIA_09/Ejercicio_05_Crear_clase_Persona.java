/*
5. Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package GUIA_09;

import GUIA_09_ENTIDADES.Persona;
import GUIA_09_SERVICIOS.PersonaService;

/*
* Lucky2103ar
 */

public class Ejercicio_05_Crear_clase_Persona {
        public static void main(String[] args) {
                PersonaService ps = new PersonaService();
                Persona persona = ps.crearPersona();
                ps.mostrarPersona(persona);
                System.out.println(persona.toString());

        }
}
