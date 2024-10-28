package unidad02.ejemplosClase;

/**
 *
 * @author diego
 */
public class InstruccionesSalto {

    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;

        for (contador2 = 0; contador2 < 20; contador2++) {
            for (contador = 0; contador < 20; contador++) {
                if (contador == 8) {
                    break;
                }
                System.out.printf("%d - %d \n", contador2, contador);
            }
        }
        System.out.println("Al salir, contador = " + contador);

    }

}
