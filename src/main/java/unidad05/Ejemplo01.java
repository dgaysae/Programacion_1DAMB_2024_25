package unidad05;

/**
 *
 * @author diego
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        // Sin arrays, tenemos esta barbaridad:
        double media;
        int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;
        nota1 = 6;
        nota2 = 7;
        nota3 = 5;
        nota4 = 9;
        nota5 = 7;
        nota6 = 8;
        nota7 = 2;
        nota8 = 1;

        media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8) / 8.0;

        System.out.println("La nota media es: " + media);

        // Con arrays:
        int[] notas = new int[8];
        System.out.println("Notas: ");
        printArray(notas);

        System.out.println("Tamaño: " + notas.length);
        notas[0] = 6;
        notas[1] = 7;
        notas[2] = 5;
        notas[3] = 9;
        notas[4] = 7;
        notas[5] = 8;
        notas[6] = 2;
        notas[7] = 1;
        printArray(notas);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
        }
        printArray(notas);

        int notaDefault = 1;
        System.out.println("notaDefault = " + notaDefault);
        inicializarArray(notas, notaDefault);
        System.out.println("notaDefault = " + notaDefault);
        printArray(notas);

        System.out.println("-------------------");

        // Definir array e inicializarlo al mismo tiempo:
        int[] edades = {2, 5, 8, 4, 5, 7, 2};
        int[] edades20 = new int[]{20, 20, 20, 20, 20, 20, 20};
        System.out.println("Edades:");
        printArray(edades);
        System.out.println("Edades 20:");
        printArray(edades20);

        edades = edades20;
        System.out.println("Edades:");
        printArray(edades);
        System.out.println("Edades 20:");
        printArray(edades20);

        edades[3] = 40;
        System.out.println("Edades:");
        printArray(edades);
        System.out.println("Edades 20:");
        printArray(edades20);

        System.out.println("-------------------");
        System.out.println("Edades:");
        printArray(edades);

        inicializarArray(edades);

        System.out.println("Edades:");
        printArray(edades);
    }

    /**
     * Los arrays, como objetos que son, se pasan por referencia. Es decir,
     * que se puede modificar su contenido dentro de una función/método.
     * 
     * @param array
     * @param valorPorDefecto 
     */
    public static void inicializarArray(int[] array, int valorPorDefecto) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valorPorDefecto;
        }
        valorPorDefecto += 10; //no se actualiza fuera de esta función
    }

    /**
     * Lo que no puede hacerse, como medida de seguridad, es desreferenciar
     * el array dentro de una función/método.
     * 
     * @param array 
     */
    public static void inicializarArray(int[] array) {
        // No se puede desreferenciar un array dentro de una función, 
        // por seguridad. Por eso, esta línea no funcionaría:
        //array = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        
        // Pero, como hemos dicho nates, si se puede cambiar elemento a elemento:
        for(int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println();
    }
}
