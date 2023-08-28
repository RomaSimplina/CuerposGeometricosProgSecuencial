import java.util.Scanner;

public class Octaedro {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double a, v, ar;

    System.out.println("Aristas: ");
    ar = entrada.nextDouble();

    //Area(pendiente)
    a = 2*ar*ar*raiz de 3;
    System.out.println("Area: "+a);

    //Volumen(pendiente)
    v =ar*ar*ar*(raiz de 2 / 3);
    System.out.println("Volumen: "+v);

    entrada.close();
    }
}
