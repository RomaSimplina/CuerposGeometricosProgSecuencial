import java.util.Scanner;

public class Dodecaedro {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double a, v , ar;

    System.out.println("Aristas: ");
    ar = entrada.nextDouble();

    //Area(pendiente)
    a =3*ar*ar*ar*(raiz de 25+10*raiz de 5);
    System.out.println("Area: "+a);

    //Volumen(pendiente)
    v = (1/4)*(15+7*raiz de 5)*ar*ar*ar;
        System.out.println("Volumen: "+v);

        entrada.close();
     
    }
}
