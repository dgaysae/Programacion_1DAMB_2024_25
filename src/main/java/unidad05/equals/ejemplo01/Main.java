package unidad05.equals.ejemplo01;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Dinero income = new Dinero(55, "USD");
        Dinero expenses = new Dinero(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);
    }

}
