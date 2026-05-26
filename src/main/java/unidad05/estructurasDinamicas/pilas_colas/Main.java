package unidad05.estructurasDinamicas.pilas_colas;

/**
 * <p>
 *     En este caso vamos a construir estructuras dinámicas de forma artesanal (craftsmanship programming).
 * </p>
 * <p>
 *     Para ello se definirá absolutamente todo lo necesario:
 *     <ul>
 *         <li>
 *             El tipo de nodo que usarán nuestras estructuras dinámicas.<br>
 *             Primero haremos una pila específica para números (Integer).<br>
 *             Después, para que nuestras estructuras sean lo más genéricas posibles y puedan admitir distintos
 *             tipos de objetos, se usarán <strong>genéricos</strong>.
 *         </li>
 *         <li>Las funcionalidades propias de cada estructura (push, pull, pop, et.).</li>
 *     </ul>
 * </p>
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("================ Pila que sólo admite números enteros ================");
        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.push(5);
        pilaNumeros.push(3);
        pilaNumeros.push(7);
        pilaNumeros.push(8);

        System.out.println("Estado actual de la cola:");
        pilaNumeros.print();

        Integer numeroEnLaCima = pilaNumeros.peek();
        System.out.println("Ahora mismo en la cima: " + numeroEnLaCima + " y la cola se mantiene:");
        pilaNumeros.print();
        System.out.println("--------------");
        numeroEnLaCima = pilaNumeros.pop();
        System.out.println("Sacamos de la cima: " + numeroEnLaCima + " y la cola queda así:");
        pilaNumeros.print();

        System.out.println("================ Pila que admite cualquier tipo de objeto ================");
        Pila<Persona> pilaPersonas = new Pila<>();
        pilaPersonas.push(new Persona("Zakaria", "00000000A"));
        pilaPersonas.push(new Persona("Rubén", "11111111B"));
        pilaPersonas.push(new Persona("Roberto", "22222222C"));
        pilaPersonas.push(new Persona("Soulemane", "33333333D"));
        pilaPersonas.push(new Persona("Francesco", "44444444E"));

        System.out.println("Estado actual de la cola:");
        pilaPersonas.print();

        Persona personaEnLaCima = pilaPersonas.peek();
        System.out.println("Ahora mismo en la cima: " + personaEnLaCima + " y la cola se mantiene:");
        pilaPersonas.print();
        System.out.println("--------------");
        personaEnLaCima = pilaPersonas.pop();
        System.out.println("Sacamos de la cima: " + personaEnLaCima + " y la cola queda así:");
        pilaPersonas.print();
    }
}
