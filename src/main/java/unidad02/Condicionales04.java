package unidad02.ejemplosClase;

public class Condicionales04 {

    public static void main(String[] args) {

        String letra = "a";

        if (letra.equals("a") || letra.equals("A")
                || letra.equals("e") || letra.equals("E")
                || letra.equals("i") || letra.equals("I")
                || letra.equals("o") || letra.equals("O")
                || letra.equals("u") || letra.equals("U")) {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " NOOOOO es una vocal");
        }

        System.out.println("SWITCH ------------------------------");

//        switch (letra) {
//            case "a":
//                System.out.println("La letra " + letra + " es una vocal");
//                break;
//            case "e":
//                System.out.println("La letra " + letra + " es una vocal");
//                break;
//            case "i":
//                System.out.println("La letra " + letra + " es una vocal");
//                break;
//            case "o":
//                System.out.println("La letra " + letra + " es una vocal");
//                break;
//            case "u":
//                System.out.println("La letra " + letra + " es una vocal");
//                break;
//            default:
//                System.out.println("La letra " + letra + " NOOOOO es una vocal");
//        }
        switch (letra) {
            case "a", "e", "i", "o", "u",
                    "A", "E", "I", "O", "U":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            default:
                System.out.println("La letra " + letra + " NOOOOO es una vocal");
        }
    }

}
