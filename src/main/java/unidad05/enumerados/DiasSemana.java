package unidad05.enumerados;

/**
 * Los enumerados se pueden entender como conjuntos de constantes relacionadas con
 * un tema en cuestión. Aunque la realidad es que se trata de una clase especial
 * que engloba instancias de sí misma para representar valores constantes y estáticos.
 *
 * La finalidad con la que se usan los enum se podría conseguir con clases abstractas
 * y métodos y atributos estáticos, aunque los enum son más limpios y específicos a la
 * hora de gestionar conjuntos de valores constantes relacionados.
 *
 * Para más información, consulta la documentación oficial:
 * <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">...</a>
 *
 * Puedes consultar otras explicaciones en:
 * <ul>
 *     <li><a href="https://jarroba.com/enum-enumerados-en-java-con-ejemplos/">Jarroba - Enum Java con ejemplos</a></li>
 *     <li><a href="https://www.w3schools.com/java/java_enums.asp">w3schools - Java Enums</a></li>
 * </ul>
 * @author diego
 */
public enum DiasSemana {
    LUNES("Lunes", "lun"),
    /**
     * Esto es un martes
     */
    MARTES("Martes", "mar"),
    MIERCOLES("Miercoles", "mie"),
    JUEVES("Jueves", "jue"),
    VIERNES("Viernes", "vie"),
    SABADO("Sabado", "sab"),
    DOMINGO("Domingo", "dom");
    
    private final String nombre;
    private final String nombreCorto;

    private DiasSemana(String nombre, String nombreCorto) {
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNombreCorto() {
        return nombreCorto;
    }
}
