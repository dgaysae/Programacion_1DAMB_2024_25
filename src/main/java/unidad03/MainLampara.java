package unidad03;

/**
 *
 * @author diego
 */
public class MainLampara {

    public static void main(String[] args) {
        String nombre = "Pepe";
        String nombre2 = new String("Juan Alfonso");
        
        System.out.println(nombre2.indexOf("n"));
        System.out.println(nombre2.indexOf("n", 6));
        
        int numero = 7;
        String numeroTexto = "" + numero;
        
        Lampara lampara1 = new Lampara();
        System.out.println(lampara1);
        
//        lampara1.marca = "Ikea";    //falla porque marca es private
        lampara1.enchufada = true;
        lampara1.interruptor = true;
        
//        System.out.println("marca = " + lampara1.marca);    //falla porque marca es private
        System.out.println("tieneBombilla = " + lampara1.tieneBombilla);
        System.out.println("enchufada = " + lampara1.enchufada);
        System.out.println("interruptor = " + lampara1.interruptor);
        
        lampara1.encender();
        lampara1.apagar();
        
        System.out.println("-------------------------------");
        
        Lampara lampara2 = new Lampara();
        lampara2.enchufada = true;
        lampara2.pulsarInterruptor();
        lampara2.pulsarInterruptor();
        lampara2.pulsarInterruptor();
        lampara2.pulsarInterruptor();
        
//        System.out.println("marca = " + lampara2.marca);
//        System.out.println("tieneBombilla = " + lampara2.tieneBombilla);
//        System.out.println("enchufada = " + lampara2.enchufada);
//        System.out.println("interruptor = " + lampara2.interruptor);
    }    
}
