import java.util.Scanner;

public class Cono {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double al, at, v;
    double r, g, h, abase;

    System.out.println("Ingrese el radio del cono : ");
    r = entrada.nextDouble();

    System.out.println("Ingrese la generatriz del cono: ");
    g = entrada.nextDouble();

    System.out.println("Ingrese la altura del cono: ");
    h = entrada.nextDouble();

    // Area lateral del cono
    al = 3.1416*r*g;
        System.out.println("Area lateral del cono: "+al);
    // Area total del cono
    abase = 3.1416*r*r;
    at = al + abase;
    System.out.println("Area total del cono: "+at);

    // Volumen
    v = (abase*h)/3;
    System.out.println("Volumen del cono: "+v);

        entrada.close();
    }
}
