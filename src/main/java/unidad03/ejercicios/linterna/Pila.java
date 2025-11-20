package unidad03.ejercicios.linterna;

/**
 * Este objeto representa una pila eléctrica.
 * La pila contiene una cantidad concreta de energía y se la proporcionará
 * a quien se la solicite.
 *
 * @author diego
 */
public class Pila {

    /**
     * Voltaje de la pila (se mide en V)
     */
    private double voltaje;

    /**
     * Capacidad de la pila (se mide en Ah)
     */
    private double capacidad;

    /**
     * Energía de la pila en cada momento (se mide en Wh).
     */
    private double energiaActual;

    /**
     * Energía máxima que tiene la pila (se mide en Wh).
     */
    private final double ENERGIA_TOTAL;

    public Pila(double V, double mAh) {
        this.voltaje = Math.abs(V);
        this.capacidad = Math.abs(mAh / 1000);  // pasamos de mAh a Ah
        ENERGIA_TOTAL = this.voltaje * this.capacidad;
        energiaActual = ENERGIA_TOTAL;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getEnergia() {
        return energiaActual;
    }

    /**
     * La pila proporcina la energía solicitada, siempre que tenga suficiente.
     * Si la pila tiene menos energía de la solicitada, devolverá la energía que
     * le queda y se quedará vacía, sin energía.
     * @param energiaSolicitada La energía que le solicita cualquier dispositivo (como la linterna).
     * @return La energía que puede ofrecer en cada momento.
     */
    public double darEnergia(double energiaSolicitada) {
        if (!pilaCargada()) return 0;

        energiaSolicitada = Math.abs(energiaSolicitada);
        if (energiaActual >= energiaSolicitada) {
            energiaActual -= energiaSolicitada;
        }
        else {
            energiaSolicitada = energiaActual;
            energiaActual = 0;
        }
        return energiaSolicitada;
    }

    public boolean pilaCargada() {
        return (energiaActual > 0);
    }
}
