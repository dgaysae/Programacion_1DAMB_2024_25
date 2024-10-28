package unidad02.ejemplosClase;

public class Funciones02 {
    
    public static void main(String[] args) {
        double resultado = 0;
        int num1 = 9;
        int num2 = 4;
        int result = 0;
        
        double dividendo = 9;
        double divisor = 3;
        
        System.out.printf("Los sumandos son %d y %d \n", num1, num2);
        result = suma(num1, num2);
        System.out.printf("%d + %d = %d \n", num1, num2, result);
        
//        resultado = division(dividendo, divisor);
//        System.out.printf("%.2f / %.2f = %.2f \n",
//                num1,
//                num2,
//                resultado);
//        
//        dividendo = 6;
//        divisor = 2;
//        resultado = division(dividendo, divisor);
//        System.out.printf("División 2: %.2f / %.2f = %.2f \n",
//                num1,
//                num2,
//                resultado);
    }
    
    public static double division(double dividendo, double divisor) {
        double resultado = 0;
        if (divisor != 0) {
            resultado = dividendo / divisor;
        }
        
        return resultado;
    }
    
    public static int suma(int num1, int num2) {
        num1 = 10;
        num2 = 20;
        
        return num1 + num2;
    }
    
}
