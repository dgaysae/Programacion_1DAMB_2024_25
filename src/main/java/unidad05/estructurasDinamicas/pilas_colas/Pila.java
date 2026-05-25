package unidad05.estructurasDinamicas.pilas_colas;

/**
 * <p>
 *     Todas las inserciones y eliminaciones se realizan por un solo extremo llamado tope o cima.
 * </p>
 * <p>
 *     Una cola es una estructura LIFO (Last In, First Out). Esto es, el último elemento
 *     en entrar en la cola es el primero que sale.
 * </p>
 * <p>
 *     Las operaciones básicas en una cola son:
 *     <ul>
 *         <li>push (apilar): agrega un nuevo elemento en la cima de la pila.</li>
 *         <li>pop (desapilar): elimina y devuelve el elemento que se encuentra en la cima.</li>
 *         <li>peek / top (cima): devuelve el elemento que está en la cima sin eliminarlo de la pila.</li>
 *         <li>isEmpty (vacía): verifica si la cola está totalmente desprovista de elementos.</li>
 *     </ul>
 * </p>
 * <p>
 *     La pila de este ejemplo se compone de un nodo que contiene un dato y un puntero al siguiente elemento.<br>
 *     Se ha hecho con <strong>genéricos</strong>, por lo que permite introducir cualquier tipo de objeto.
 * </p>
 * @param <T> Admitirá cualquier objeto.
 */
public class Pila<T> {

    class Nodo {
        T dato;
        Nodo siguiente;
    }

    private Nodo cima = null;
    private Integer size = 0;

    /**
     * Comprueba si la pila está vacía.
     * @return true si no tiene elementos.
     */
    public boolean isEmpty() {
        return (cima == null);
    }

    /**
     * Agrega un nuevo elemento en la cima de la pila.
     * @param nuevoNumero
     */
    public void push(T nuevoNumero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = nuevoNumero;

        if (isEmpty()) {
            cima = nuevoNodo;
        }
        else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) return null;

        Nodo nodoAux = cima.siguiente;
        T numero = cima.dato;
        cima = nodoAux;
        size--;

        return numero;
    }

    public T peak() {
        if (isEmpty()) return null;

        return cima.dato;
    }

    public Integer size() {
        return size;
    }

    public void print() {
        if (cima == null) {
            System.out.println("Lista vacía!!!");
        }
        else {
            Nodo nodoAux = cima;
            while(nodoAux != null) {
                System.out.print( nodoAux.dato + " -");
                nodoAux = nodoAux.siguiente;
            }
        }
    }
}
