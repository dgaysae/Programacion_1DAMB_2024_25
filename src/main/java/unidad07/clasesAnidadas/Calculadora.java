package unidad07.clasesAnidadas;

/**
 *
 * @author diego
 */
public class Calculadora {
    private int numeroOperaciones = 0;

    public static class Operaciones {

        public static int suma(int... sumandos) {

            int resultado = 0;

            for (int sumando : sumandos) {
                resultado = resultado + sumando;
            }

            return resultado;
        }
        
        void printHola() {
            System.out.println("Hola ");
        }

        public static int resta(int... restandos) {

            int resultado = 0;

            for (int restado : restandos) {
                resultado = resultado + restado;
            }

            return resultado;

        }

    }

}
