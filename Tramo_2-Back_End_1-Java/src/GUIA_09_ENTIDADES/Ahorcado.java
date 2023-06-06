/*
2. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario.
 */
package GUIA_09_ENTIDADES;

/*
* Lucky2103ar
 */
public class Ahorcado {

        // ATRIBUTOS
        private char[] palabraBuscar;
        private Integer cantLetrasEncontradas;
        private Integer cantJugadasMaximas;
        
        // Constructores

        public Ahorcado() {
        }

        public Ahorcado(char[] palabraBuscar, /*Integer cantLetrasEncontradas,*/ Integer cantJugadasMaximas) {
                this.palabraBuscar = palabraBuscar;
                this.cantLetrasEncontradas = 0;
                this.cantJugadasMaximas = cantJugadasMaximas;
        }
        
        // Getters y Setters

        public char[] getPalabraBuscar() {
                return palabraBuscar;
        }

        public void setPalabraBuscar(char[] palabraBuscar) {
                this.palabraBuscar = palabraBuscar;
        }

        public Integer getCantLetrasEncontradas() {
                return cantLetrasEncontradas;
        }

        public void setCantLetrasEncontradas(Integer cantLetrasEncontradas) {
                this.cantLetrasEncontradas = cantLetrasEncontradas;
        }

        public Integer getCantJugadasMaximas() {
                return cantJugadasMaximas;
        }

        public void setCantJugadasMaximas(Integer cantJugadasMaximas) {
                this.cantJugadasMaximas = cantJugadasMaximas;
        }

        @Override
        public String toString() {
                return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", cantLetrasEncontradas=" + cantLetrasEncontradas + ", cantJugadasMaximas=" + cantJugadasMaximas + '}';
        }
        
 }
