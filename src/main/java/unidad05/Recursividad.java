package unidad05;

/**
 * Vamos a ver brevemente el concepto de recursividad.
 * Una función recursiva es aquella que se llama a si misma.
 * Una función recursiva será correcta siempre que tenga un CASO BASE o condición
 * que detenga la ejecución, evitando que sea infinita. Al llegar a dicha condición, la
 * función deja de llamarse a sí misma y devuelve un resultado.
 * Para más información:
 * <a href="https://es.wikipedia.org/wiki/Recursi%C3%B3n_(ciencias_de_computaci%C3%B3n)">Recursión (ciencias de computación)</a>
 */
public class Recursividad {
    public static void main(String[] args) {
        int numero = 8;
        cuentaAtras(numero);

        int resultado = fibonacci(numero);
        System.out.printf("El número de Fibonacci en la posición %d es %d%n", numero, resultado);

    }

    /**
     * Ejemplo nada recomendable de función recursiva.
     * Esta función hace una cuenta atrás partiendo del número introducido.
     * El caso base es cuando llega a 0.
     * @param numero
     */
    public static void cuentaAtras(int numero) {
        if (numero <= 0) return;

        System.out.println(numero);
        cuentaAtras(numero - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
