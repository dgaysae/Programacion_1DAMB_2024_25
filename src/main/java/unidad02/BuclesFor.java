package unidad02.ejemplosClase;

public class BuclesFor {

    public static void main(String[] args) {
        int cont = 0;
        int incrementoUno = 1;
        int incrementoDos = 2;
        
        // Incremento de 1 en 1
        System.out.println(cont);
        cont = cont + 1;
        System.out.println(cont);
        cont = cont + incrementoUno;
        System.out.println(cont);
        cont += 1;
        System.out.println(cont);
        cont += incrementoUno;
        System.out.println(cont);
        cont++;
        System.out.println(cont);
        
        System.out.println("-----------------");
        // Incremento de 2 en 2
        cont = 0;
        System.out.println(cont);
        cont = cont + 2;
        System.out.println(cont);
        cont = cont + incrementoDos;
        System.out.println(cont);
        cont += 2;
        System.out.println(cont);
        cont += incrementoDos;
        System.out.println(cont);
        
        
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d \n", contador);
        }
        System.out.println("-----------------");

        for (int contador = 0;
                (contador <= 10) && (contador != 7);
                contador++) {
            System.out.printf("%d \n", contador);
        }
        
        System.out.println("-----------------");

        int sumaPares = 0;
        for(int contador = 2; contador <= 10; contador += 2) {
            System.out.println("contador = " + contador);
            sumaPares += contador;
            System.out.println("sumaPares = " + sumaPares);
        }
    }
/*
contador    acumulador
1           1
2           1 + 2 = 3
3           3 + 3 = 6
4           6 + 4 = 10
5
6
*/
}
