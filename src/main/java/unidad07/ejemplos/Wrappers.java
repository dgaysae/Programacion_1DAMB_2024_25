package unidad07.ejemplos;

public class Wrappers {

    public static void main(String args[]) {
        /**
         * *****************
         * CONVERSIONES
         * *****************
         */
        byte numByte = 14;
        char numChar = '9';
        short numShort = 342;
        int numInt = 130;
        long numLong = 44;
        float numFloat = 12.33f;
        double numDouble = 12.33d;

        System.out.println("****************************");
        System.out.println("TIPOS DE DATOS PRIMITIVOS");
        System.out.println("****************************");
        System.out.println("numByte = " + numByte);

        numDouble = numInt;
        System.out.println("numInt = " + numInt);

//        numInt = numByte;
//        System.out.println("numInt = " + numInt);
        numByte = (byte) numInt;
        System.out.println("numByte = " + numByte);

        // Devuelve sólo la parte entera:
        System.out.println("Devuelve sólo la parte entera:");
        numDouble = numInt / numLong;
        System.out.println("numDouble = " + numDouble);

        // Soluciones:
        numDouble = 1.0d * numInt / numLong;
        System.out.println("numDouble = " + numDouble);

        numDouble = (double) numInt / numLong;
        System.out.println("numDouble = " + numDouble);

        double numDouble1 = numInt;
        double numDouble2 = numLong;
        numDouble = numDouble1 / numDouble2;
        System.out.println("numDouble = " + numDouble);

        System.out.println("****************************");
        System.out.println("COMPATIBILIDAD DE TIPOS - Uso de wrappers para resolverlos");
        System.out.println("****************************");
        String cadena;

        System.out.println("Integer.toString");
        // Forma menos elegante de pasar entero a String:
        cadena = "" + numInt;
        // Forma recomendada de pasar entero a String:
        cadena = Integer.toString(numInt);
        System.out.println(cadena);

        cadena = "14.35";
        System.out.println("cadena = " + cadena);

        System.out.println("Double.parseDouble - Puede provocar excepción");
        try {
            numDouble = Double.parseDouble(cadena);
            System.out.println("numDouble = " + numDouble);
        } catch (NumberFormatException e) {
            System.out.printf("Error! %s no se puede convertir a double", cadena);
        }

        try {
            System.out.println("Integer.parseInt - Puede provocar excepción");
            numInt = Integer.parseInt(cadena);
            System.out.println("numInt = " + numInt);
        } catch (NumberFormatException e) {
            System.out.printf("Error! %s no se puede convertir a entero", cadena);
        }

        System.out.println();
        System.out.println("WRAPPER - CHARACTER *************************** ");
        System.out.println(numChar);
        System.out.println("Es una letra? " + Character.isLetter(numChar));
        System.out.println("Es una mayúscula? " + Character.isUpperCase(numChar));

        System.out.println("Obtener el número que representa un carácter: ");
        System.out.println("1. Directamente, asignando un char a un int (no se pierde información):");
        numInt = numChar;
        System.out.println(numInt + " es el valor numérico de la tabla ASCII/Unicode para el carácter " + numChar);

        if (Character.isDigit(numChar)) {
        System.out.println("2. Mediante el método Character.getNumericValue (recomendable):");
            numInt = Character.getNumericValue(numChar);
            System.out.println("numInt = " + numInt);
        } else {
            System.out.println(numChar + " no contiene un carácter que represente un dígito, por tanto no puede convertirse a un tipo numérico como int");
        }
    }
}
