/*
2. Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */
package GUIA_09_ENTIDADES;

/**
 * Lucky2103ar
 */
public class ParDeNumeros {

        // ATRIBUTOS
        private Double N1;
        private Double N2;

        // CONSTRUCTORES
        public ParDeNumeros() {
                // Math.random()*(MAXVAL - minVAL+1) + minVAL     0,0 y 1,0
                N1 = Math.random() * /*(10- 10) +*/ 10;
                N2 = Math.random() * /*  (10 - 10) +*/ 10;
        }

        // GETTERS y SETTERS
        public Double getN1() {
                return N1;
        }

        public void setN1(Double N1) {
                this.N1 = N1;
        }

        public Double getN2() {
                return N2;
        }

        public void setN2(Double N2) {
                this.N2 = N2;
        }

        // PARA CONTROL
        @Override
        public String toString() {
                return "ParDeNumeros{" + "N1=" + N1 + ", N2=" + N2 + '}';
        }
}
