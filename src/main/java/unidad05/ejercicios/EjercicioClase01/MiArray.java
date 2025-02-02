package unidad05.ejercicios.EjercicioClase01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir por teclado el número de elementos del array. El array podrá añadir
 * elementos (por el final) o insertarlos (por el principio). Si el array está
 * lleno, no admitirá más números.
 *
 * @author diego
 */
public class MiArray {

    private static final int LENGTH_INCREMENTO = 5;
    private Scanner recibirDeTeclado = new Scanner(System.in);
    private int[] array;
    private int arrayLength = 0;

    /**
     * Crea nuestra estructura de datos MiArray con la longitud indicada por teclado.
     */
    public MiArray() {
        setArray();
    }

    /**
     * Crea nuestra estructura de datos MiArray con la longitud indicada.
     * @param length
     */
    public MiArray(int length) {
        setArray(length);
    }

    /**
     * TODO: este constructor creará el array interno con la longitud indicada y lo rellenará con el número introducido.
     * @param length
     */
    public MiArray(int length, int numeroRelleno) {

    }

    /**
     * Crea el array con el tamaño que indique el usuario por teclado.
     */
    private void setArray() {
        int numElementos = leerEnteroDeTeclado("Introduce el tamaño del array: ");
        setArray(numElementos);
    }

    /**
     * Crea el array con el tamaño indicado.
     * @param length Tamaño del array.
     */
    private void setArray(int length) {
        array = new int[length];
        System.out.println("Array creado correctamente: ");
        System.out.println(Arrays.toString(array));
    }

    public int length() {
        return arrayLength;
    }

    /**
     * TODO: refactoriza el método para que se use de forma privada de forma que si se llena, se pueda ampliar su tamaño.
     * @return
     */
    public boolean estaLleno() {
        return arrayLength == array.length;
    }

    public boolean isEmpty() {
        return arrayLength == 0;
    }

    /**
     * Pide un número por teclado y lo añade al final de la lista.
     */
    public void add() {
        int nuevoNumero = leerEnteroDeTeclado("Introduzca el nº a añadir: ");
        add(nuevoNumero);
    }

    /**
     * TODO: refactoriza el método para que, si se ha llegado al límite del array, aumente su tamaño y añada el nuevo número.
     * Añade al final de la lista el número indicado.
     * @param numeroAlFinal Número a añadir
     */
    public void add(int numeroAlFinal) {
        if (estaLleno()) {
            System.out.printf("El número %d no se ha añadido. El array está lleno. %n",
                    numeroAlFinal);
            return;
        }
        array[arrayLength++] = numeroAlFinal;

        System.out.printf("El nº %d se ha añadido correctamente %n", numeroAlFinal);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Pide un número por teclado y lo inserta al principio de la lista.
     */
    public void insertar() {
        int nuevoNumero = leerEnteroDeTeclado("Introduzca el nº a insertar: ");
        insertar(nuevoNumero);
    }

    /**
     * TODO: refactoriza el método para que, si se ha llegado al límite del array, aumente su tamaño e inserte el nuevo número.
     * Inserta el número indicado al principio de la lista.
     * @param numeroAlPrincipio Número a insertar
     */
    private void insertar(int numeroAlPrincipio) {
        if (estaLleno()) {
            System.out.printf("El número %d no se ha insertado. El array está lleno. %n",
                    numeroAlPrincipio);
            return;
        }
        // Desplazamos los datos a la derecha:
        for (int i = arrayLength; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = numeroAlPrincipio;
        arrayLength++;
        System.out.printf("El nº %d se ha insertado correctamente %n", numeroAlPrincipio);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Recorre el array buscando el mayor valor de todos.
     * @return valor máximo de la lista
     */
    public int max() {
        if (isEmpty()) {
            System.out.println("El array está vacío!!");
            return 0;
        }

        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            if (maximo < array[i]) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    /**
     * TODO: implementa este método que obtiene el menor de los números del array.
     * @return
     */
    public int min() {
        return 0;
    }

    /**
     * TODO: implementa este método que obtiene la media aritmética de los números del array.
     * @return
     */
    public double media() {
        return 0.0;
    }

    /**
     * TODO: implementa este método que devuelve un valor aleatorio del array.
     * @return
     */
    public int getRandom() {
        return 0;
    }

    /**
     * Crea otro array de mayor tamaño en el que se copian los valores del
     * original.
     * Después se referencia el original a ese nuevo array.
     */
    public void aumentarLength() {
        int[] arrayAux = new int[array.length + LENGTH_INCREMENTO];
        for (int i = 0; i < arrayLength; i++) {
            arrayAux[i] = array[i];
        }
        array = arrayAux;
        System.out.println("El array ha aumentado su tamaño:");
        System.out.println(Arrays.toString(array));
    }

    /**
     * TODO: implementa este método. Si lo ves conveniente, refactoriza otros métodos que ya tengas implementados para hacerlo más óptimo.
     * Inserta en el array el número introducido en la posición indicada.
     * @param posicion donde se insertará el número.
     * @param numeroAInsertar valor a insertar.
     */
    public void insertarEn(int posicion, int numeroAInsertar) {

    }

    /**
     * TODO: implementa este método para que borre la posición que se le ha indicado. Esto supone que los elementos
     * posteriores deben desplazarse hacia atrás.
     * @param posicion
     */
    public void borrar(int posicion) {

    }

    /**
     * TODO: implementa este método para que borre las posiciones entre desde (incluida) y hasta (excluida).
     * Esto supone que los elementos posteriores deben desplazarse hacia atrás.
     * Si hasta sobrepasa el límite, se borrarán todos los elementos desde la posición desde.
     * @param desde
     * @param hasta
     */
    public void borrar(int desde, int hasta) {

    }

    /**
     * TODO: implementa este método para que borre todos los elementos desde la posición indicada hasta el final.
     * @param posicion
     */
    public void borrarDesde(int posicion) {

    }

    /**
     * TODO: implementa este método para ejecutarlo en los métodos que creas oportunos. Se encargará de comprobar si
     * el array interno tiene posiciones vacías. Si tiene más de 10 posiciones vacías, las eliminará dejando solamente
     * 5 posiciones libres.
     */
    private void garbageCollector() {

    }

    /**
     * TODO: implementa este método para mostrar el contenido de los elementos de esta estructura.
     * @return
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * Pide la entrada de un número por teclado.
     * @param msg Mensaje que se muestra por pantalla
     * @return Número introducido por teclado
     */
    private int leerEnteroDeTeclado(String msg) {
        int numero = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println(msg);
                numero = recibirDeTeclado.nextInt();
                esNumero = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido");
                esNumero = false;
            }
            recibirDeTeclado.nextLine();

        } while (!esNumero);

        return numero;
    }
}
