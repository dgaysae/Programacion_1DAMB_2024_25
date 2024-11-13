package unidad03.ejercicios;

/**
 *
 * @author diego
 */
public class Neumatico {
    private final int KM_MAX_RODAJE;
    private final int PRESION_MAX_RECOMENDADA;
    private final int PRESION_MIN_RECOMENDADA;
    private int kmRodados;
    private boolean pinchado = false;
    private int presion;
    
    /**
     * Crea el objeto Neumático
     * 
     * @param presionMaxRecomendada
     * @param presionMinRecomendada
     * @param kmMaximosDeRodaje 
     */
    public Neumatico(int presionMaxRecomendada,
            int presionMinRecomendada,
            int kmMaximosDeRodaje) {
        PRESION_MAX_RECOMENDADA = presionMaxRecomendada;
        PRESION_MIN_RECOMENDADA = presionMinRecomendada;
        KM_MAX_RODAJE = kmMaximosDeRodaje;
        
        presion = PRESION_MAX_RECOMENDADA;
        kmRodados = 0;
    }
    
    public int getPresion() {
        return presion;
    }
    
    public int getKmRecorridos() {
        return kmRodados;
    }
    
    public int getPresionRecomendada() {
        return PRESION_MAX_RECOMENDADA;
    }
    
    public void inflar(int incremento) {
        if (incremento >= 0
                && !pinchado) {
            presion += incremento;
            if (presion > PRESION_MAX_RECOMENDADA) {
                presion = PRESION_MAX_RECOMENDADA;
            }
            
//            presion = (presion + incremento > PRESION_MAX_RECOMENDADA)
//                    ? PRESION_MAX_RECOMENDADA
//                    : presion + incremento;
        }
    }
    
    public void pierdePresion(int decremento) {
        if (!pinchado) {
            presion -= Math.abs(decremento);

            if (presion < 0){
                presion = 0;
            }
        }
    }
    
    public void pinchar() {
        pinchado = true;
        presion = 0;
    }
    
    /**
     * 
     * @param km 
     */
    public void recorrer(int km) {
        if (km > 0) {
            kmRodados += km;
        }
    }
    
    public boolean estaDesgastado() {
//        if (kmRodados > KM_MAX_RODAJE){
//            return true;
//        }
//        return false;
        
        return kmRodados > KM_MAX_RODAJE;
    }
    
    public boolean estaDeshinchado() {
//        if (presion < PRESION_MIN_RECOMENDADA) {
//            return true;
//        }
//        return false;
        return presion < PRESION_MIN_RECOMENDADA;
        
    }
    
    @Override
    public String toString() {
        return "Neumático {"
                + "\nKM_MAX_RODAJE = " + KM_MAX_RODAJE
                + "\n, PRESION_MAX_RECOMENDADA = " + PRESION_MAX_RECOMENDADA
                + "\n, PRESION_MIN_RECOMENDADA = " + PRESION_MIN_RECOMENDADA
                + "\n, kmRodados = " + kmRodados
                + "\n, pinchado = " + pinchado
                + "\n, presion = " + presion
                + "\n}";
    }
}
