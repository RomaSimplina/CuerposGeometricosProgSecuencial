import java.util.Scanner;

public class Hexaedro {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double a, v;
    double ar;

    System.out.println("Aristas: ");
    ar = entrada.nextDouble();

    //Area
    a = 6*ar*ar;
    System.out.println("Area: "+a);

    //Volumen
    v = ar*ar*ar;
    System.out.println("Volumen: "+v);

    entrada.close();

    }
}
