/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:




 */
package GUIA_09_SERVICIOS;

import GUIA_09_ENTIDADES.Cadena;
import java.util.Scanner;

/**
 * Lucky2103ar
 */
public class CadenaServicio {

        private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        public Cadena crearCadena() {
                System.out.print("Ingrese su frase: ");
//        String frase = leer.nextLine();
//        return new Cadena(frase);
                return new Cadena(leer.nextLine());
        }

// a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
// que tiene la frase ingresada.
        public int mostrarVocales(Cadena cad) {
                int contVocal = 0;
                String letra;
                for (int i = 0; i < cad.getLongitud(); i++) {
                        letra = cad.getFrase().substring(i, i + 1); // Utilizo una variable auxiliar para evitar hacer muy extensa la condición lógica de if sgte.
                        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("á") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("é")
                                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("í") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("ó")
                                || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("ú") || letra.equalsIgnoreCase("ü")) {
                                contVocal++;
                        }
                }
                return contVocal;
        }

        //REVISAR
//    public void mostrarVocales() {
//
//        String vocales = "aeiouAEIOU";
//        int contador = 0;
//
//        for (int i = 0; i < fs.getLongitud(); i++) {
//            char actual = fs.getFrase().charAt(i);
//            if (vocales.contains(String.valueOf(actual))) {
//                contador++;
//            }
//        }
//          System.out.println(fs.getLongitud());
//        System.out.println("la cantidad de vocales es: "+ contador );
//    }
// b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
// por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
// asac".
        public String invertirFrase(Cadena cad) {
                String nuevaCad = cad.getFrase().substring(cad.getLongitud() - 1, cad.getLongitud());

                for (int i = cad.getLongitud() - 1; i > 0; i--) {
                        nuevaCad = nuevaCad.concat(cad.getFrase().substring(i - 1, i));
                }

                return nuevaCad;
        }
        //EJEMPLO
//        hola mundo
//        cadena.substring (0,3) = hola
//        cadena.substring(10-1,10) = o

        //REVISAR
//public void invertirFrase(){
//    StringBuilder sb = new StringBuilder(fs.getFrase());
//    sb.reverse();
//    String fraseInvertida = sb.toString();
//    System.out.println("La frase invertida seria: " + fraseInvertida);
//    }
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces.
        public int vecesRepetido(Cadena cad, String letra) {
                int contLetra = 0;
                for (int i = 0; i < cad.getLongitud(); i++) {
                        if (cad.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                                contLetra++;
                        }
                }
                return contLetra;
        }

//e) Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
        public Integer compararLongitud(Cadena cad, String frase) {
                return cad.getLongitud().compareTo(frase.length());
        }

//f) Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
        public void unirFrases(Cadena cad, String frase) {
                System.out.println("La frase formada es: " + cad.getFrase().concat(frase));
        }

//g) Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
        
        public void reemplazar(Cadena cad, String letra){
                System.out.println("La frase con la \"a\" reemplazada por " + letra + " es: " + cad.getFrase().replaceAll("a", letra));
        }
        
//        h) Método contiene(String letra), deberá comprobar si la frase contiene
//        una letra que ingresa el usuario y devuelve verdadero si la contiene y
//        falso si no.
        public boolean contiene(Cadena cad, String letra){
                return cad.getFrase().contains(letra);
        }
}
