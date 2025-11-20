package unidad03.ejercicios.mandotv;

/**
 * Este ejercicio hace uso de la composición. En ella, un objeto puede ser atributo de otro.
 * En este caso tenemos un objeto Television que puede encenderse/apagarse, cambiar de canal, subir/bajar volumen, etc.
 * Todas esas operaciones pueden hacerse desde la propia Television (tiene métodos públicos que lo permiten) o  desde
 * el mando universal.
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Television tv = new Television(
                "Panasonic",
                "TV-55Z90AE6",
                80);
        
        MandoUniversal mando = new MandoUniversal(tv);
        System.out.println(tv);
        
        mando.subirVolumen();
        System.out.println(tv);
        
        mando.pulsarOnOff();
        System.out.println(tv);
        
    }
}
