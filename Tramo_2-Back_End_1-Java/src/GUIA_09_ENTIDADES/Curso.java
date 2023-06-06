/*
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
 */
package GUIA_09_ENTIDADES;

import java.util.Scanner;

/*
* Lucky2103ar
 */
public class Curso {

        // ATRIBUTOS
        private String nombreCurso;
        private Float cantidadHorasPorDia;
        private Integer cantidadDiasPorSemana;
        private String turno;
        private Float precioPorHora;
        private String[] alumnos = new String[5];

        // AUXILIARES
        private Scanner leeNum = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        private Scanner leerStr = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        // CONSTRUCTORES
//        a) Un constructor por defecto.
        public Curso() {
        }

//        b) Un constructor con todos los atributos como parámetro.
        public Curso(String nombreCurso, Float cantidadHorasPorDia, Integer cantidadDiasPorSemana, String turno, Float precioPorHora) {
                this.nombreCurso = nombreCurso;
                this.cantidadHorasPorDia = cantidadHorasPorDia;
                this.cantidadDiasPorSemana = cantidadDiasPorSemana;
                this.turno = turno;
                this.precioPorHora = precioPorHora;
        }

        // GETTERS y SETTERS
//        c) Métodos getters y setters de cada atributo.
        public String getNombreCurso() {
                return nombreCurso;
        }

        public void setNombreCurso(String nombreCurso) {
                this.nombreCurso = nombreCurso;
        }

        public Float getCantidadHorasPorDia() {
                return cantidadHorasPorDia;
        }

        public void setCantidadHorasPorDia(Float cantidadHorasPorDia) {
                this.cantidadHorasPorDia = cantidadHorasPorDia;
        }

        public Integer getCantidadDiasPorSemana() {
                return cantidadDiasPorSemana;
        }

        public void setCantidadDiasPorSemana(Integer cantidadDiasPorSemana) {
                this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        }

        public String getTurno() {
                return turno;
        }

        public void setTurno(String turno) {
                this.turno = turno;
        }

        public Float getPrecioPorHora() {
                return precioPorHora;
        }

        public void setPrecioPorHora(Float precioPorHora) {
                this.precioPorHora = precioPorHora;
        }

        public String[] getAlumnos() {
                return alumnos;
        }

        public void setAlumnos(String[] alumnos) {
                this.alumnos = alumnos;
        }

//        d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
//        los alumnos que asisten a las clases. Nosotros nos encargaremos de
//        almacenar esta información en un arreglo e iterar con un bucle,
//        solicitando en cada repetición que se ingrese el nombre de cada
//        alumno.
        public void cargarAlumnos() {
                for (int i = 0; i < alumnos.length; i++) {
                        System.out.print("Ingrese el nombre del " + (i + 1) + "° alumno del curso: ");
                        alumnos[i] = leerStr.nextLine();
                }
        }

//        e) Método crearCurso(): el método crear curso, le pide los valores de
//        los atributos al usuario y después se le asignan a sus respectivos
//        atributos para llenar el objeto Curso. En este método invocamos al
//        método cargarAlumnos() para asignarle valor al atributo alumnos
        public void crearCurso() {
                System.out.print("Ingrese el nombre del Curso: ");
                nombreCurso = leerStr.nextLine();
                System.out.print("Ingrese la cantidad de horas por día del Curso: ");
                cantidadHorasPorDia = leeNum.nextFloat();
                do {
                        System.out.print("Ingrese la cantidad de dias por semana que se dicta el Curso: ");
                        cantidadDiasPorSemana = leeNum.nextInt();
                        if (cantidadDiasPorSemana < 1 || cantidadDiasPorSemana > 7) {
                                System.err.println("Ingreso incorrecto...");
                        }
                } while (cantidadDiasPorSemana < 1 || cantidadDiasPorSemana > 7);

                do {
                        System.out.print("Ingrese el turno del dictado del Curso: ");
                        turno = leerStr.nextLine()/*.charAt(0)*/;
                        System.out.println(turno);
                        if (!(turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("T"))) {
                                System.err.println("Opción incorrecta...");
                        }
                } while (!(turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("T")));
                
                System.out.print("Ingrese el precio por hora del Curso: $ ");
                precioPorHora = leeNum.nextFloat();
                cargarAlumnos();
        }
        
//        f) Método calcularGananciaSemanal(): este método se encarga de
//        calcular la ganancia en una semana por curso. Para ello, se deben
//        multiplicar la cantidad de horas por día, el precio por hora, la
//        cantidad de alumnos y la cantidad de días a la semana que se repite
//        el encuentro.
        public Float calcularGananciaSemanal(){
                return (float) Math.round(cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana * 100) / 100 ;
        }

}
