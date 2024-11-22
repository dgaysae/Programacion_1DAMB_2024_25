package unidad03;

/**
 * 
 * @author diego
 */
public class NumerosAleatorios {
    
    public static void main(String[] args) {
        int menor, mayor;
        
        /**
         * Generar un nº aleatorio del 0 al 10
         */
        menor = 0;
        mayor = 10;
        
        double numAleatorio = Math.random() * (mayor + 1);
        System.out.println("numAleatorio = " + numAleatorio);
        
        int aleatorio = (int)(numAleatorio);
        System.out.println("aleatorio = " + aleatorio);
        
        double num = 0.5;
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.round(num));
        
        /**
         * Generar un nº aleatorio entre dos límites:
         */
        menor = 5;
        mayor = 10;
        
        numAleatorio = Math.random() * (mayor - menor + 1) + menor;
        System.out.println("numAleatorio = " + numAleatorio);
        
        aleatorio = (int)(numAleatorio * mayor + 1);
        System.out.println("aleatorio = " + aleatorio);
        
    }
    
}
