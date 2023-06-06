/*
1. Desarrollar una clase Cancion con los siguientes atributos: t?tulo y autor.
Se deber? definir adem?s dos constructores: uno vac?o que inicializa el
t?tulo y el autor a cadenas vac?as y otro que reciba como par?metros el
t?tulo y el autor de la canci?n. Se deber?n adem?s definir los m?todos
getters y setters correspondientes.
 */

package GUIA_07_ENTIDADES;

/**
* Lucky2103ar
*/

public class Cancion {
    //ATRIBUTOS
    private String titulo;
    private String autor;

    //CONSTRUCTORES
    public Cancion() {
        titulo = "";
        autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //METODOS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
