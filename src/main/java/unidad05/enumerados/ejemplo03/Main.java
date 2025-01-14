package unidad05.enumerados.ejemplo03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base = 4;
        int altura = 6;

        System.out.println("Calcular superficies de figuras geométricas:");

        System.out.println(FiguraGeometrica.CIRCUNFERENCIA.calcularArea(base));
        System.out.println(FiguraGeometrica.CUADRADO.calcularArea(base));
        System.out.println(FiguraGeometrica.RECTANGULO.calcularArea(base, altura));
        System.out.println(FiguraGeometrica.TRIANGULO.calcularArea(base, altura));
    }

    public static int leerEnteroDeTeclado() {
        Scanner entradaTeclado = new Scanner(System.in);

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

        entradaTeclado.close();

        return numero;
    }
}
