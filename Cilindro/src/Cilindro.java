import java.util.Scanner;
//Roma Simplina
//aurorasimplina@gmail.com

public class Cilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double al, at, v;
        double p, r, h, abase;

        //Area lateral del cilindro

        System.out.println("Ingrese el radio del cilindro: ");
        r = entrada.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        h = entrada.nextDouble();

        p = 2*Math.PI*r;
        al = p*h;

       System.out.println("Area lateral : "+al);

       //Area total del cilindro
       at = p*(h+r);
       System.out.println("Area total : "+at);

       //Volumen del cilindro
       abase = Math.PI*Math.pow(r,2);
       v = abase*h;
       System.out.println("Volumen : "+v);

       entrada.close();

    }
}

