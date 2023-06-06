/*
3. Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (?H? para hombre, ?M?
para mujer, ?O? para otro), peso y altura. Si desea a?adir alg?n otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
 */

package GUIA_08_ENTIDADES;

/**
* Lucky2103ar
*/
public class Persona {
    // ATRIBUTOS
    private String nombre;
    private Integer edad;
    private String sexo; // ?H? para hombre, ?M? para mujer, ?O? para otro),
    private Float peso;
    private Float altura;
    
    // CONSTRUCTORES

    public Persona() {
    }

    public Persona(String nombre, Integer edad, String sexo, Float peso, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    
    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
 }
