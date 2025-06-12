package unidad07.polimorfismo.ejemplo02;

public class Main {

    public static void main(String args[]) {
        Cat c = new Cat();
        System.out.println(c.health);
        Dog d = new Dog();
        System.out.println(d.health);

        System.out.println(c);
        Mammal m = (Mammal) c;  // upcasting
        System.out.println(m);

        Cat c1 = new Cat();
        Animal a = c1; // upcasting a Animal
        if (a instanceof Cat) { // testeamos si a es un gato
            System.out.println("¡a es un gato!");
            System.out.println("Podemos hacer downcasting con tranquilidad");
            Cat c2 = (Cat) a;
        }

    }
}
