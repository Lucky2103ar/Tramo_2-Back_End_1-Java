/*
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
 */
package Integrador_Entidades;

/*
* Lucky2103ar
 */
public class Estudiante {
        // ATRIBUTOS

        private String nombre;
        private Float nota;
        
        // CONSTRUCTORES
        public Estudiante() {
        }

        public Estudiante(String nombre, Float nota) {
                this.nombre = nombre;
                this.nota = nota;
        }

        // GETTERS y SETTERS
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public Float getNota() {
                return nota;
        }

        public void setNota(Float nota) {
                this.nota = nota;
        }

        @Override
        public String toString() {
                return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
        }
}
