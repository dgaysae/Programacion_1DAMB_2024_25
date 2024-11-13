package unidad02.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author diego
 */
public class CajaFuerte {
    public static Scanner entradaTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        final int CLAVE_VALIDA = 1111;
        final int MAX_INTENTOS = 4;
        int contadorIntentos = 0;
        int claveIntroducida = 0;
        boolean claveCorrecta = (claveIntroducida == CLAVE_VALIDA);
        
        while(!claveCorrecta && contadorIntentos < MAX_INTENTOS) {
            claveIntroducida = leerEnteroDeTeclado();
            contadorIntentos++;
            System.out.printf("Intento %d de %d\n",
                    contadorIntentos,
                    MAX_INTENTOS);
            
            if (tiene4Digitos(claveIntroducida)
                    && claveIntroducida == CLAVE_VALIDA) {
                claveCorrecta = true;
            }
        }
        
        if (claveCorrecta) {
            System.out.println("Caja abierta!!");
        }
        else {
            System.out.println("Caja bloqueada");
        }
        
    }
    
    public static boolean tiene4Digitos(int numero) {
        return (numero >= 1000 && numero <= 9999);
    }
    
    public static int leerEnteroDeTeclado() {
        int numero = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println("Intro número: ");
                numero = entradaTeclado.nextInt();
                esNumero = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido");
                esNumero = false;
            }
            entradaTeclado.nextLine();

        } while (!esNumero);

        return numero;
    }
}
