package unidad02.ejercicios;

/**
 * Año bisiesto
 * Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4;
 * utilícese el operador módulo. ¡Pero hay más excepciones!
 * Los múltiplos de 100 no son bisiestos, aunque sean múltiplos de 4. Pero los
 * múltiplos de 400 sí, aunque sean múltiplos de 100. Qué follón. La Tierra es
 * muy maleducada al no ajustarse a los patrones de tiempo humanos.
 * 
 * Resumiendo:
 * un año es bisiesto si es divisible entre 4, a menos que sea divisible entre
 * 100. Sin embargo, si un año es divisible entre 100 y además es divisible
 * entre 400, también resulta bisiesto. Ahora, prográmalo, a ver qué sale.
 * 
 * @author diego
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        int anio = 2000;
        
        if ((anio % 4 == 0 && anio % 100 != 0)
                || (anio % 400 == 0)) {
            System.out.printf("El año %d es bisiesto!! \n", anio);
        }
        else {
            System.out.printf("El año %d no es bisiesto \n", anio);
        }
    }
    
}
