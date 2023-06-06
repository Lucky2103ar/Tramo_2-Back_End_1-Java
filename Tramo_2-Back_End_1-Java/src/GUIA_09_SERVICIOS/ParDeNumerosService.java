/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
 */
package GUIA_09_SERVICIOS;

import GUIA_09_ENTIDADES.ParDeNumeros;

/**
 * Lucky2103ar
 */
public class ParDeNumerosService {

//        a) Método mostrarValores que muestra cuáles son los dos números
//        guardados.
        public void mostrarValores(ParDeNumeros nums) {
                System.out.println("El número N1 es: " + nums.getN1());
                System.out.println("El número N2 es: " + nums.getN2());
        }

//        b) Método devolverMayor para retornar cuál de los dos atributos tiene
//        el mayor valor
        public Double devolverMayor(ParDeNumeros nums) {
                return Math.max(nums.getN1(), nums.getN2());
//                if (nums.getN1() > nums.getN2()) {
//                        return nums.getN1();
//                } else {
//                        return nums.getN2();
//                }
        }

        // CREO UN METODO AUXILIAR PARA CALCULAR EL MENOR DE LOS 2
        public Double devolverMenor(ParDeNumeros nums) {
                return Math.min(nums.getN1(), nums.getN2());
//                if (nums.getN1() < nums.getN2()) {
//                        return nums.getN1();
//                } else {
//                        return nums.getN2();
//                }
        }

//     c) Método calcularPotencia para calcular la potencia del mayor valor de
//        la clase elevado al menor número. Previamente se deben redondear
//        ambos valores.   
        public Double calcularPotencia(ParDeNumeros nums) {
                return Math.pow(Math.round(devolverMayor(nums)), Math.round(devolverMenor(nums)));
        }

//        d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//        dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//        valor absoluto del número.
        // REDONDEO EL VALOR ANTES DE CALCULAR LA RAIZ CUADRADA
        public Double calculaRaiz(ParDeNumeros nums) {
                return Math.sqrt(Math.abs(Math.round(devolverMenor(nums))));
        }
}
