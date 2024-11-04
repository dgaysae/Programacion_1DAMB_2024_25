package unidad03;

/**
 *
 * @author diego
 */
public class Lampara {
    boolean interruptor = false;
    boolean tieneBombilla = true;
    private String marca = "";
    boolean enchufada = false;
    
    public void pulsarInterruptor() {
        interruptor = !interruptor;
        if (interruptor && tieneBombilla && enchufada) {
            encender();
        } else {
            apagar();
        }
    }
    
    public void encender() {
        System.out.printf("Lámpara %s encendida \n", marca);
    }
    
    public void apagar() {
        System.out.printf("Lámpara %s apagada \n", marca);
    }
}
