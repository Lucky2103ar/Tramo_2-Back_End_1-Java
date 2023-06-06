/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set.
 */
package GUIA_09_ENTIDADES;

import java.util.Date;

/*
* Lucky2103ar
 */
public class Persona {

        // ATRIBUTOS
        private String nombre;
        private Date fechaDeNacimiento;

        // CONSTRUCTORES
        public Persona() {
        }

        public Persona(String nombre, Date fechaDeNacimiento) {
                this.nombre = nombre;
                this.fechaDeNacimiento = fechaDeNacimiento;
        }

        // GETTERS y SETTERS
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public Date getFechaDeNacimiento() {
                return fechaDeNacimiento;
        }

        public void setFechaDeNacimiento(Date fechaDeNacimiento) {
                this.fechaDeNacimiento = fechaDeNacimiento;
        }

        @Override
        public String toString() {
                return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
        }

}
