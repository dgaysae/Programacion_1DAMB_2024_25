package unidad05;

/**
 * Explica la búsqueda secuencial.
 * Implementar la búsqueda binaria y comprobar su eficiencia.
 * @author diego
 */
public class Ejemplo03Busquedas {

    public static void main(String[] args) {
        // Inicializar un array:
        int[] edades = {
            34,
            55,
            61,
            98,
            12
        };

        // Inicializar una matriz:
        int[][] notas = {
            {3, 8, 9, 5},
            {10, 10, 10, 10, 10},
            {0}
        };

        printMatriz(notas);

        System.out.println("----------------");
        printMatriz2(notas);

        System.out.println("----------------");
        int numeroBuscar = 98;
        System.out.printf("Busncando personas con %d años...%n", numeroBuscar);
        if (contains(edades, numeroBuscar)) {
            System.out.println("Hay personas con esa edad!!! :-)");
        } else {
            System.out.println("No hay personas con esa edad :-(");
        }

        System.out.println("----------------");
        numeroBuscar = 8;
        System.out.printf("Buscando NOTAS que sean %d...%n", numeroBuscar);
        for (int i = 0; i < notas.length; i++) {
            if (contains(notas[i], numeroBuscar)) {
                System.out.printf("En la fila %d se ha encontrado la nota!!! :-)%n", i);
            } else {
                System.out.printf("En la fila %d no se ha encontrado la nota :-(%n", i);
            }
        }
    }

    /**
     * Comprobar si el número a buscar está en el array.
     * La búsqueda es secuencial.
     * @param array
     * @param numeroABuscar
     * @return 
     */
    public static boolean contains(int[] array, int numeroABuscar) {
        for (int numero : array) {
            if (numero == numeroABuscar) {
                return true;
            }
        }
        return false;
    }

    private static void printMatriz(int[][] notas) {
        for (int[] fila : notas) {
            for (int nota : fila) {
                System.out.printf("%d ", nota);
            }
            System.out.println();
        }
    }

    private static void printMatriz2(int[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            int numColumnas = notas[i].length;
            for (int j = 0; j < numColumnas; j++) {
                System.out.printf("%d ", notas[i][j]);
            }
            System.out.println();
        }
    }
}
