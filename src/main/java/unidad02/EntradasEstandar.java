package unidad02;



import java.util.Scanner;

public class EntradasEstandar {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        String texto = "";
        String palabra1 = "";
        String palabra2 = "";
        int numero;

        System.out.println("Introduce un texto: ");
        // Para recoger toda la línea (hasta el ENTER):
        texto = entradaTeclado.nextLine();

        System.out.println("El texto que has introducido es: " + texto);

        System.out.println("-------------------------");
        System.out.println("Introduce varias palabras: ");
        palabra1 = entradaTeclado.next();
        palabra2 = entradaTeclado.next();
        texto = entradaTeclado.nextLine();

        System.out.printf("Palabra1 = %s ; Palabra2 = %s \n", palabra1, palabra2);
        System.out.println("texto: " + texto);

        System.out.println("-------------------------");
        System.out.println("Introduce un texto: ");

        // entrada: hola Pepe<ENTER>
        // palabra1 = hola
        palabra1 = entradaTeclado.next();

        // entrada: Pepe<ENTER>
        // palabra1 = Pepe
        palabra2 = entradaTeclado.next();

        // entrada: <ENTER>
        System.out.println("Introduce un número: ");
        //Limpiar entrada de teclado:
        entradaTeclado.nextLine();
        
        // Leer número entero
        numero = entradaTeclado.nextInt();
        
        System.out.println("Has introducido: " + numero);

    }

}
