package unidad07.ejercicios;

import java.util.Scanner;

/**
 * 
 * @author diego
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduce num1");
            Double num1 = Double.parseDouble(sc.nextLine());

            Double num2;
            do {
                System.out.println("Introduce num2");
                num2 = Double.parseDouble(sc.nextLine());
            } while(num2 == 0);

            System.out.println(suma(num1, num2));
            System.out.println(Double.sum(num1, num2));
            
            System.out.println(num1 * num2);
            
            System.out.println(num1 / num2);

            System.out.println(num1 % num2);

        } catch (ArithmeticException e) {
            System.out.println("");
        } catch (NumberFormatException e) {
            System.out.println("Introduce num valido");

        }
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
}
