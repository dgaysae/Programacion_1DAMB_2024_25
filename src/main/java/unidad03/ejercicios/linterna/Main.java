package unidad03.ejercicios.linterna;

/**
 * Este ejercicio hace uso de la composición. En ella, un objeto puede ser atributo de otro.
 * En este caso tenemos un objeto pila que da energía a otro objeto linterna.
 * Cuando la linterna se enciende, le pide energía a la pila para poder iluminar.
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Pila pila1 = new Pila(3.7, 1000);
        Linterna linterna1 = new Linterna(
                0.5,
                pila1);

        printEstadoPila(pila1);

        linterna1.encender(59d / 60);
        printEstadoPila(pila1);

        linterna1.encender(59d / 60);
        printEstadoPila(pila1);

        linterna1.encender(59d / 60);
        printEstadoPila(pila1);
    }

    public static void printEstadoPila(Pila pila) {
        System.out.println("--- DATOS DE LA PILA ---");
        System.out.printf("Energía pila: %.2f %n",
                pila.getEnergia());
        System.out.println("------------------------");

    }
}
