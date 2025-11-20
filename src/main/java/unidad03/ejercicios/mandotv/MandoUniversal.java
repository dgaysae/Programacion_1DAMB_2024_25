package unidad03.ejercicios.mandotv;

/**
 * Este objeto representa un mando universal de TV.
 * El mando está asociado a una TV sobre la que actuará cada vez que se pulse alguno
 * de sus botones.
 *
 * @author diego
 */
public class MandoUniversal {
    private Television tv;
    
    public MandoUniversal(Television tv) {
        this.tv = tv;
    }
    
    public void pulsarOnOff() {
        tv.pulsarOnOff();
    }
    
    public void subirVolumen() {
        tv.subirVolumen();
    }
    
    public void bajarVolumen() {
        tv.bajarVolumen();
    }
    
    public void subirCanal() {
        tv.subirCanal();
    }
    
    public void bajarCanal() {
        tv.bajarCanal();
    }
}
