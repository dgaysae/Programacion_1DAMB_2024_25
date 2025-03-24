package unidad07.apdo3_2;

/**
 * Un objeto final no puede cambiar su referencia a otra posición de memoria.
 * @author diego
 */
public class Main01 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("11111111A", "Anselmo", "Pérez Pérez");
        final Persona persona2 = new Persona("22222222B", "Eusebio", "Sánchez López");
        System.out.println("Persona 1: " + persona1);
        persona1 = persona2;
        System.out.println("Persona 1: " + persona1);

        persona1 = new Persona("11111111A", "Anselmo", "Pérez Pérez");
        // La siguiente línea daría un error en tiempo de compilación:
        //persona2 = persona1;
    }    
}
