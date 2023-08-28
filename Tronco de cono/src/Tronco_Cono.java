import java.util.Scanner;

public class Tronco_Conos {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double al, at, v;
    double g, rm, r, h;

    System.out.println("Ingrese la altura: ");
    h = entrada.nextDouble();

    System.out.println("ingrese el radio mayor: ");
    rm = entrada.nextDouble();

    System.out.println("Ingrese el radio menor");
    r = entrada.nextDouble();

    System.out.println("Ingrese la generatriz: ");
    g = entrada.nextDouble();

    //Area lateral
    al = 3.1416* g*(rm+r);
    System.out.println("Area lateral: "+al);

    //Area total(pendiente)
    at = 

    //Volumen
    v = (1/3)*3.1416*h*(rm*rm+r+r+rm*r);
    System.out.println("Volumen : "+v);

    entrada.close();

    
    
    }
}
