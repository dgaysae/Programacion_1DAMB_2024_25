package unidad05.enumerados;

/**
 * Este enumerado contiene constantes para los días de la semana.
 *
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

    LUNES("Lunes", "lun", "L"),
    MARTES("Martes", "mar", "M"),
    MIERCOLES("Miercoles", "mie", "X"),
    JUEVES("Jueves", "jue", "J"),
    VIERNES("Viernes", "vie", "V"),
    SABADO("Sabado", "sab", "S"),
    DOMINGO("Domingo", "dom", "D");

    /**
     * Cada constante (LUNES, MARTES, ...), como instancia de DiasSemana que es,
     * tendrá estos atributos.
     * El nombre contiene el texto del nombre del día.
     */
    private final String nombre;

    /**
     * Nombre abreviado del día.
     */
    private final String nombreCorto;

    /**
     * Letra que representa al día.
     */
    private final String abreviatura;

    /**
     * Los constructores de los enumerados son, por definición, privados ya que no se debe
     * instanciar fuera de ellos.
     * Sirven para asignar a los atributos de cada constante los valores correspondientes.
     *
     * @param nombre
     * @param nombreCorto
     * @param abreviatura
     */
    private DiasSemana(String nombre, String nombreCorto, String abreviatura) {
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.abreviatura = abreviatura;
    }

    /**
     * Para cada día de la semana, devuelve su nombre.
     * @return nombre del día
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Para cada día de la semana, devuelve su nombre corto.
     * @return nombre corto del día
     */
    public String getNombreCorto() {
        return nombreCorto;
    }

    /**
     * Para cada día de la semana, devuelve su abreviatura.
     * @return abreviatura del día
     */
    public String getAbreviatura() {
        return abreviatura;
    }
}
