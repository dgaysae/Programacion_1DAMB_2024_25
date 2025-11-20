package unidad03.ejercicios.mandotv;

/**
 * Este objeto representa una televisión.
 * Además de su estado (propiedades), permitirá realizar acciones sobre ella (métodos) para cambiar dicho estado: subir
 * o bajar volumen, cambiar de canal, encender o apagar, etc.
 *
 * @author diego
 */
public class Television {

    /**
     * Cada TV tiene un volumen máximo.
     */
    private final int MAX_VOLUMEN;

    /**
     * Todas las TV subirán/bajarán el volumen de X en X unidades indicadas en SALTO_VOLUMEN.
     */
    private static final int SALTO_VOLUMEN = 5;

    /**
     * Ninguna TV puede superar este volumen.
     */
    private static final int MAX_VOLUMEN_ESTANDAR = 120;

    /**
     * Ninguna TV puede tener más de estos canales.
     */
    private static final int MAX_CANALES = 200;

    private String marca;
    private String modelo;
    private boolean encendida = false;
    private int volumen;
    private int canal = 1;

    public Television(String marca,
            String modelo,
            int volumenMaximo) {
        this.marca = marca;
        this.modelo = modelo;
        if (volumenMaximo < 0
                || volumenMaximo > MAX_VOLUMEN_ESTANDAR) {
            volumenMaximo = MAX_VOLUMEN_ESTANDAR;
        }
        MAX_VOLUMEN = volumenMaximo;
        volumen = MAX_VOLUMEN / 2;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getCanal() {
        return canal;
    }

    /**
     * Si la TV está encendida se apaga y viceversa.
     */
    public void pulsarOnOff() {
        encendida = !encendida;
    }

    public void subirVolumen() {
        if (!encendida) return;

        volumen += SALTO_VOLUMEN;
        if (volumen > MAX_VOLUMEN) {
            volumen = MAX_VOLUMEN;
        }

        printVolumen("+");
    }

    public void subirVolumen(int numeroSaltos) {
        if (!encendida) return;

        if (numeroSaltos > 0) {
            for (int i = 0; i < numeroSaltos; i++) {
                subirVolumen();
            }
        }
    }

    public void bajarVolumen() {
        if (!encendida) return;

        volumen -= SALTO_VOLUMEN;
        if (volumen < 0) {
            volumen = 0;
        }

        printVolumen("-");
    }

    public void bajarVolumen(int numeroSaltos) {
        if (!encendida) return;

        if (numeroSaltos > 0) {
            for (int i = 0; i < numeroSaltos; i++) {
                bajarVolumen();
            }
        }
    }

    public void subirCanal() {
        if (!encendida) return;

        canal++;
        if (canal > MAX_CANALES) {
            canal = MAX_CANALES;
        }
    }

    public void bajarCanal() {
        if (!encendida) return;

        canal--;
        if (canal < 1) {
            canal = 1;
        }
    }

    private void printVolumen(String signo) {
        System.out.printf("VOL %s ", signo);
        for (int i = 0; i < volumen; i += 5) {
            System.out.print("|");
        }
        System.out.printf(" (%d) %n", volumen);
    }

    @Override
    public String toString() {
        if (!encendida) {
            return String.format("""
               Marca:   %s
               Modelo:  %s
               Canal:   -
               Volumen: -
               --------------------------
               """, marca, modelo);
        }
        else {
            return String.format("""
               Marca:   %s
               Modelo:  %s
               Canal:   %d
               Volumen: %d
               --------------------------
               """, marca, modelo, canal, volumen);
        }
    }
}
