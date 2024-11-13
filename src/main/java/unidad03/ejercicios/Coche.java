package unidad03.ejercicios;

/**
 * 
 * @author diego
 */
public class Coche {
    /**
     * Identificador de rueda delantera izquierda.
     */
    private static final int RUEDA_DELANTERA_IZDA = 1;
    
    /**
     * Identificador de rueda delantera derecha.
     */
    private static final int RUEDA_DELANTERA_DCHA = 2;
    private static final int RUEDA_TRASERA_IZDA = 3;
    private static final int RUEDA_TRASERA_DCHA = 4;

    private final int CABALLOS;
    private final String COLOR;
    private final int KM_REVISION;
    private final double LITROS_MAX;
    private final String MARCA;
    private final String MODELO;

    private int kmRecorridos;
    private double litrosRepostados;
    private Neumatico ruedaDelanteraDcha;
    private Neumatico ruedaDelanteraIzda;
    private Neumatico ruedaTraseraDcha;
    private Neumatico ruedaTraseraIzda;
    private Neumatico ruedaRepuesto;

    public Coche(String marca,
            String modelo,
            String color,
            double litrosRepostados,
            double litrosMax,
            int caballos,
            int kmRevision) {

        this.MARCA = marca;
        this.MODELO = modelo;
        this.COLOR = color;
        this.kmRecorridos = 0;
        CABALLOS = caballos;
        this.litrosRepostados = litrosRepostados;
        LITROS_MAX = litrosMax;
        KM_REVISION = kmRevision;

        ruedaDelanteraDcha = new Neumatico(120, 90, 80000);
        ruedaDelanteraIzda = new Neumatico(120, 90, 80000);
        ruedaTraseraDcha = new Neumatico(120, 90, 80000);
        ruedaTraseraIzda = new Neumatico(120, 90, 80000);
        ruedaRepuesto = new Neumatico(90, 60, 100);
    }

    public void repostar(double litros) {
        if (litros > 0) {
            litrosRepostados += litros;
            if (litrosRepostados > LITROS_MAX) {
                litrosRepostados = LITROS_MAX;
            }
        }
    }

    /**
     * Incrementará los km recorridos con el valor que se le pasa como
     * parámetro.
     *
     * @param km kilómetros recorridos
     */
    public void recorrer(int km) {
        if (km > 0 && litrosRepostados > 0) {
            final int KM_POR_LITRO = 12;

            litrosRepostados -= km / (double) KM_POR_LITRO;
            kmRecorridos += km;

            ruedaDelanteraDcha.recorrer(km);
            ruedaDelanteraIzda.recorrer(km);
            ruedaTraseraDcha.recorrer(km);
            ruedaTraseraIzda.recorrer(km);
        }
    }

    /**
     * Comprueba si el coche necesita ir a revisión.
     * 
     * @return true si los km recorridos rebasan el máximo para la revisión.
     */
    public boolean necesitaRevision() {
        return kmRecorridos > KM_REVISION;
    }

    public Neumatico getRueda(int rueda) {
        switch (rueda) {
            case RUEDA_DELANTERA_IZDA:
                return ruedaDelanteraIzda;
            case RUEDA_DELANTERA_DCHA:
                return ruedaDelanteraDcha;
            case RUEDA_TRASERA_IZDA:
                return ruedaTraseraIzda;
            case RUEDA_TRASERA_DCHA:
                return ruedaTraseraDcha;
            default:
                return null;
        }
    }

    /**
     * Cuando se pincha una rueda, hay que cambiarla por la de repuesto.
     * Si ya se ha usado la de repuesto, no se podrá cambiar y el coche
     * se quedará con la rueda pinchada.
     * 
     * @param rueda Identificador de la rueda.
     */
    public void pincharRueda(int rueda) {
        switch (rueda) {
            case RUEDA_DELANTERA_IZDA:
                ruedaDelanteraIzda.pinchar();
                cambiarRueda(ruedaDelanteraIzda);
                break;
            case RUEDA_DELANTERA_DCHA:
                ruedaDelanteraDcha.pinchar();
                cambiarRueda(ruedaDelanteraDcha);
                break;
            case RUEDA_TRASERA_IZDA:
                ruedaTraseraIzda.pinchar();
                cambiarRueda(ruedaTraseraIzda);
                break;
            case RUEDA_TRASERA_DCHA:
                ruedaTraseraDcha.pinchar();
                cambiarRueda(ruedaTraseraDcha);
                break;
            default:
                System.out.println("Rueda no válida.");
        }
    }
    
    private void cambiarRueda(Neumatico r) {
        if (ruedaRepuesto != null) {
            r = ruedaRepuesto;
            ruedaRepuesto = null;
        }
    }
}
