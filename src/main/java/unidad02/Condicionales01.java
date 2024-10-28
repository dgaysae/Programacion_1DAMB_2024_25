package unidad02;

public class Condicionales01 {

    public static void main(String[] args) {

        int edadPersona = 19;

        System.out.println("¿Es un adulto?");

        if (edadPersona > 18) {
            System.out.println("Esta persona es mayor de edad");
        }
        else if (edadPersona == 18) {
            System.out.println("Esta persona aún es adolescente");
        }
        else {
            System.out.println("No, esta persona es menor de edad");
        }

    }

}
