import java.util.Scanner;

public class Icosaedro {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double a, v, ar;

    System.out.println("Aristas: ");
    ar = entrada.nextDouble();

    //Area(pendiente)
    a = 5*ar*ar*raiz de 3;
    System.out.println("Area: "+a);

    //Volumen(pendiente)
    v = (5/12)*(3+raiz de 5)*ar*ar*ar;
    System.out.println("Volumen : "+v);

    entrada.close();

 
    }
}
