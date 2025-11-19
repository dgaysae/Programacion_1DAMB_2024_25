package unidad03.ejercicios.linterna;

/**
 * Este objeto representa una linterna eléctrica.
 * La linterna usa una pila eléctrica que le suministra la energía necesaria
 * para funcionar.
 * Mientras la pila tenga energía, la linterna podrá iluminar.
 * @author diego
 */
public class Linterna {

    private Pila pila;
    private double amperiosConsume;

    public Linterna(double consumoEnAmperios, Pila pila) {
        this.pila = pila;
        amperiosConsume = consumoEnAmperios;
    }

    /**
     * Al encender la pila se solicita energía a la pila eléctrica.
     * Si la pila no tiene la energía suficiente, devolverá la que le queda
     * para que la literna permanezca encendida el tiempo correspondiente.
     * @param tiempoEnHoras Tiempo que la literna va a permanecer encendida.
     */
    public void encender(double tiempoEnHoras) {
        double energiaNecesaria = tiempoEnHoras
                * amperiosConsume
                * pila.getVoltaje();
        double energiaDisponible = pila
                .darEnergia(energiaNecesaria);

        System.out.printf("Energía que necesita la linterna: %.2f %n",
                energiaNecesaria);
        System.out.printf("Energía que ofrece la pila: %.2f %n",
                energiaDisponible);
        
        if (energiaDisponible < energiaNecesaria) {
            tiempoEnHoras = energiaDisponible / (amperiosConsume * pila.getVoltaje());
        }
        System.out.printf("Linterna encendida durante %.2f horas %n",
                tiempoEnHoras);
    }
}
