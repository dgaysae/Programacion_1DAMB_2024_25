package unidad05.estructurasDinamicas.pilas_colas;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Una cola es una estructura dinámica de tipo FIFO (First In, First Out). Esto es:
 *     <ul>
 *         <li>Es dinámica porque puede cambiar su tamaño en tiempo de ejecución.</li>
 *         <li>Es FIFO porque el primer elemento en entrar en la cola es el primero que sale.</li>
 *     </ul>
 *     En otras palabras, las inserciones se realizan por un extremo (cola) y las eliminaciones
 *     por el opuesto (cabecera).
 * </p>
 * <p>
 *     Las operaciones básicas en una cola son:
 *     <ul>
 *         <li><strong>Enqueue</strong> (encolar): añade un elemento al final (cola) de la cola.</li>
 *         <li><strong>Dequeue</strong> (desencolar): extrae y devuelve el elemento que se encuentra en la cabecera.</li>
 *         <li><strong>Front</strong> (frente): devuelve el elemento de la cabecera sin eliminarlo.</li>
 *         <li><strong>isEmpty</strong> (vacía): verifica si la cola está totalmente desprovista de elementos.</li>
 *     </ul>
 * </p>
 * <p>
 *     La cola de este ejemplo se compone de un nodo que contiene un dato y un puntero al siguiente elemento.<br>
 *     Se ha hecho con <strong>genéricos</strong>, por lo que permite introducir cualquier tipo de objeto.
 * </p>
 * @param <T> Admitirá cualquier objeto.
 * @see Pila
 */
public class Cola<T> {

    /**
     * Las clases sirven para permitirnos construir tipos de datos complejos.
     * Este es el caso, donde cada nodo de la cola se compondrá de un dato y un
     * puntero al siguiente elemento de la cola.
     */
    class Nodo {
        T dato;
        Nodo siguiente;
    }

    /**
     * Final de la cola, por donde se añaden elementos a la cola.
     */
    private Nodo cola = null;

    /**
     * Los elementos se extraen por la cabecera.
     */
    private Nodo cabecera = null;

    private Integer size = 0;

    /**
     * Introduce un nuevo nodo en la cola.
     * Si la cola está vacía, dicho nodo será el primer nodo, al que apuntan
     * tanto la cola como la cabecera.
     * Si la cola no está vacía y se añaden más nodos por la cola, la cabecera no
     * cambia. Seguirá apuntando el mismo nodo final.
     * @param nuevoNumero
     */
    public void enqueue(T nuevoNumero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = nuevoNumero;

        if (isEmpty()) {
            cola = nuevoNodo;
            cabecera = nuevoNodo;
        }
        else {
            nuevoNodo.siguiente = cola;
            cola = nuevoNodo;
        }
        size++;
    }

    /**
     * Indica si no hay elementos en la cola.
     * @return true si la cola está vacía.
     */
    public boolean isEmpty() {
        return (cola == null);
    }

    /**
     * Devuelve el elemento que se encuentra en la cabecera y lo quita de la cola.
     * @return
     */
    public T dequeue() {
        if (isEmpty()) return null;

        Nodo nodoAux = cola;
        if (cola.siguiente == null) { // solo hay un nodo
            nodoAux = cola;
            cola = null;
            cabecera = null;
            return nodoAux.dato;
        }

        Nodo nodoAnterior = null;

        while(nodoAux != cabecera) {
            nodoAnterior = nodoAux;
            nodoAux = nodoAux.siguiente;
        }
        nodoAnterior.siguiente = null;
        cabecera = nodoAnterior;

        size--;

        return nodoAux.dato;
    }

    /**
     * Devuelve el elemento de la cabecera sin eliminarlo.
     * @return Dato del
     */
    public T front() {
        if (isEmpty()) return null;

        return cabecera.dato;
    }

    /**
     * Recorre los nodos de la cola y mete sus datos en una lista para imprimirla.
     */
    public void print() {
        List<T> lista = new ArrayList<>();
        Nodo nodoAux = cabecera;
        while(nodoAux != null) {
            lista.add(nodoAux.dato);
            nodoAux = nodoAux.siguiente;
        }

        System.out.println(lista);
    }
}
