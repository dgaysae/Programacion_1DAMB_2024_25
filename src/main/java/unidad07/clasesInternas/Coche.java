package unidad07.clasesInternas;

/**
 * CLASES INTERNAS
 * Son clases anidadas que NO son estáticas. Es decir, se requiere su instanciación como objeto.
 * Esto obliga a que la clase que la contiene debe ser instanciada previamente.
 * Las clases internas pueden accede a los miembros (atributos y métodos) de la clase que las contiene.
 */
public class Coche {
    private String marca;
    private Motor motor;

    public Coche(String marca, int cilindrada) {
        this.marca = marca;
        this.motor = new Motor(cilindrada);
    }

    public void darContacto() {
        motor.arrancar();
    }

    public void quitarContacto() {
        motor.apagar();
    }

    public void mostrarInformacionMotor() {
        System.out.println("Marca del coche: " + marca);
        System.out.println("Cilindrada del motor: " + motor.cilindrada);
    }

    public void mostrarMotor() {
        System.out.println(motor);
    }

    /**
     * Clase interna
     */
    private class Motor {
        int cilindrada;
        boolean arrancado = false;

        public Motor(int cilindrada) {
            this.cilindrada = cilindrada;
        }

        public void arrancar() {
            arrancado = true;
            System.out.println("El motor ha arrancado.");
        }

        public void apagar() {
            arrancado = false;
            System.out.println("El motor se ha apagado.");
        }

        @Override
        public String toString() {
            return "Motor de un " + marca + " con cilindrada " + cilindrada + " está "
            + ((arrancado) ? "arrancado" : "parado");
        }
    }
}
