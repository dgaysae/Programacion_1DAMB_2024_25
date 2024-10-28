package unidad02;



public class Funciones01 {

    public static void main(String[] args) {
        int num1;
        String texto = "";
        
        System.out.println("main > hola");
        
        saludar();
        saludar("Anselmo");
        saludar("Anselmo", "Peláez Gurrutxaga");

        texto = nombreCompleto("Anselmo", "Peláez Gurrutxaga");
        System.out.println("El resultado devuelto por nombreCompleto es: " + texto);
        
        System.out.println("Fin del programa!");
    }
    
    public static void saludar() {
        System.out.println("Hola, usuario!");
    }
    
    public static void saludar(String nombre) {
        System.out.printf("Hola, %s! \n", nombre);
    }
    
    public static void saludar(String nombre, String apellidos) {
        System.out.printf("Hola, %s %s! \n", nombre, apellidos);
    }
    
    public static String nombreCompleto(String nombre, String apellidos) {
        String completo = nombre + " " + apellidos;
        System.out.printf("El nombre completo es: %s \n", completo);
        
        return completo;
    }
    
}
