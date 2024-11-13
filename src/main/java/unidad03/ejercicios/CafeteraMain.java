package unidad03.ejercicios;

/**
 * 
 * @author diego
 */
public class CafeteraMain {
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera("Rowenta");
        System.out.println("Marca: " + cafetera1.getMarca());
        System.out.println("Capacidad: " + cafetera1.getCapacidadDepositoAgua());
        cafetera1.setCapacidadDepositoAgua(-25);
        System.out.println("Capacidad: " + cafetera1.getCapacidadDepositoAgua());
        System.out.println("Cantidad: " + cafetera1.getCantidadAguaDeposito());
        
        cafetera1.aniadirAgua(1000);
        System.out.println("Cantidad: " + cafetera1.getCantidadAguaDeposito());
        
    }
    
}
