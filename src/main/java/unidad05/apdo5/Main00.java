package unidad05.apdo5;

/**
 * String vs StringBuffer vs StringBuilder
 * String es inmutable. En cambio StringBuffer no. Es muy similar a StringBuilder pero más seguro que éste cuando
 * se usan con hilos (threads).
 * Por ahora, como los hilos no se verán hasta el curso que viene, vamos a usar preferiblemente StringBuilder. Hasta
 * entonces es indiferente a usar StringBuffer.
 * @author diego
 */
public class Main00 {
    public static void main(String[] args) {
        /*
        String es inmutable. La concatenación es, en realidad, la creación de otra cadena, desreferenciando la
        anterior. Esto, cuando se hacen muchas, tiene un coste añadido para el garbage collector que se puede
        evitar usando StringBuilder/StringBuffer.
        */
        String texto = "hola"; // {'h', 'o', 'l', 'a'}
        
        System.out.println("String----------");
        
        texto += ", Pepe";
        
        System.out.println(texto);
        System.out.println("StringBuffer ----------");
        
        StringBuffer texto2 = new StringBuffer("hola");
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        // Añadimos texto al final:
        texto2.append(", Pepe");
        
        System.out.println(texto2);
        System.out.println("----------");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        // Añadimos texto al final:
        texto2.append("1 2 3 4 5 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");

        // Añadimos texto al final:
        texto2.append("6 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());

        System.out.println("----------");
        
        texto2.delete(0, 5);
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");
        
        texto2.insert(0, "hola,");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");
        
        texto2.reverse();
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
    }
}
