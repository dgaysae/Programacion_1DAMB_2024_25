package unidad02.ejercicios;

/**
 * Contar cifras
 * Determinar el número de cifras de un número entero. El algoritmo debe
 * funcionar para números de hasta 5 cifras, considerando los negativos.
 * Por ejemplo, si se introduce el número 5342, la respuesta del programa debe
 * ser 4. Si se introduce –250, la respuesta debe ser 3. Para los
 * quisquillosos: no, el 0 a la izquierda no cuenta.
 * 
 * @author diego
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        final int LIMITE = 99999;
        int num = 0;
        int contador = 0;
        
        num = Math.abs(num);
        
        if (num > LIMITE) {
            System.out.println("El programa sólo funciona con números de 5 cifras.");
        }
        else if (num == 0) {
            contador = 1;
        }
        else {
            
            while (num > 0) {
                contador++;
                System.out.println("contador = " + contador);
                System.out.println("num = " + num);
                num = num / 10;
                System.out.println("num / 10 = " + num);
                System.out.println("--------------------");
            }
        }
        
        System.out.println("contador = " + contador);
        
        
    }
    
}
