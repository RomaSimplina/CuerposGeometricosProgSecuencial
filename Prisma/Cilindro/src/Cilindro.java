import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double al, at, v;
        double p, r, h;

        //Area lateral del cilindro

        System.out.println("Ingrese el radio del cilindro: ");
        r = entrada.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        h = entrada.nextDouble();

        p = 2*3.1416*r;
        al = p*h;

       System.out.println("Area lateral : "+al);

        

    }
}
