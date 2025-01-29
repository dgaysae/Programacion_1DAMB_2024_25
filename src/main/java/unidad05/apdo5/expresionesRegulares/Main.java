package unidad05.apdo5.expresionesRegulares;

/**
 * Vamos a implementar las expresiones regulares para validar los formatos explicados en:
 * https://youtu.be/n7leNDm7D5g?feature=shared
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Entero : " + validaEntero("+87"));
        System.out.println("Real : " + validaReal("+87.77"));
        System.out.println("Teléfono ES : " + validaTelefonoEs("+34666554433"));
        System.out.println("DNI : " + validaDNI("45678901A"));
        System.out.println("Matrícula : " + validaMatriculaCocheES("0123BBC"));
    }

    public static boolean validaEntero(String s) {
        return s.matches("\\+?-?[0-9]+");
    }

    public static boolean validaReal(String s) {
        return s.matches("\\+?-?[0-9]+(\\.[0-9]+)?");
    }

    public static boolean validaTelefonoEs(String s) {
        return s.matches("\\+34[0-9]{9}");
    }

    public static boolean validaDNI(String s) {
        return s.matches("^[0-9]{7,8}[A-Z]{1}$");
    }

    /**
     * Siempre tiene 4 cifras y 3 letras.
     * Si empieza por 0, éste se escribe.
     * Las 3 letras nunca son vocales
     * @param s
     * @return
     */
    public static boolean validaMatriculaCocheES(String s) {
        return s.matches("^[0-9]{4}[A-Z&&[^AEIOU]]{3}$");
    }

    public static boolean validaEmail(String s) {
        return true;
    }
}
