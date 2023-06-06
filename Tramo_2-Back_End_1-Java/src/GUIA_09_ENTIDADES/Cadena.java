/*
1. Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática.
 */
package GUIA_09_ENTIDADES;

/**
 * Lucky2103ar
 */
public class Cadena {
        // ATRIBUTOS

        private String frase;
        private Integer longitud;

        // CONSTRUCTORES
        public Cadena() {
        }

        public Cadena(String frase) {
                this.frase = frase;
                this.longitud = frase.length();
        }

        // SETTERS Y GETTERS
        public String getFrase() {
                return frase;
        }

        public void setFrase(String frase) {
                this.frase = frase;
                this.longitud = frase.length();
        }

        public Integer getLongitud() {
                return longitud;
        }

        public void setLongitud(Integer longitud) {
                //this.longitud = longitud;
        }

        @Override
        public String toString() {
                return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
        }

}
