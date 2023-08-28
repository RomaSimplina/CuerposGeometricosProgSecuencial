import java.util.Scanner;

public class Husoe_Cuñae {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double r, nGrados;
    double a, v;

    System.out.println("Ingrese el radio: ");
    r = entrada.nextDouble();

    System.out.println("Ingrese el numero de grados: ");
    nGrados = entrada.nextDouble();

    //Area
    a = (4*3.1416*r*r*nGrados)/360;
    System.out.println("Area: "+a);

    //Volumen
    v = (4/3)*((3.1416*r*r*r)/360);
    System.out.println("Volumen: "+v);

    entrada.close();


    }
}
