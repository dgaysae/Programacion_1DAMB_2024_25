package unidad02.ejercicios;

/**
 * Mayor, menor, mediano Dados tres números enteros, A, B, C, determinar cuál es
 * el mayor, cuál el menor y cuál el mediano. Y da gracias a que no lo hemos
 * hecho con 4 variables. Prohibido usar arrays, suponiendo que sepas lo que
 * son. Es un ejercicio de lógica, no de bucles.
 *
 * @author diego
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        int a = 3,
                b = 1,
                c = 7;

        printLugarNumero(a, b, c);
        printLugarNumero(b, a, c);
        printLugarNumero(c, b, a);

    }

    /**
     * Evalúa numeroAEvaluar con respecto a num2 y num3 e indica en qué posición
     * se encuentra: el menor, el de enmedio o el mayor.
     *
     * @param numeroAEvaluar Número a evaluar
     * @param num2 Número con el que se compara num1
     * @param num3 Número con el que se compara num1
     */
    public static void printLugarNumero(int numeroAEvaluar,
            int num2,
            int num3) {
        if (numeroAEvaluar < num2 && numeroAEvaluar < num3) {
            System.out.printf("%d es el menor \n", numeroAEvaluar);
        } else if (numeroAEvaluar > num2 && numeroAEvaluar > num3) {
            System.out.printf("%d es el mayor \n", numeroAEvaluar);
        } else {
            System.out.printf("%d es el del centro \n", numeroAEvaluar);
        }
    }
}
