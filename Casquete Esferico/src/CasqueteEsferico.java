import java.util.Scanner;

public class CasqueteEsferico {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       double rm, h;
       double a, v;

       System.out.println("Ingrese el radio mayor de la esfera: ");
       rm = entrada.nextDouble();

       System.out.println("Ingrese la altura de la esfera: ");
       h = entrada.nextDouble();

       //Area
       a = 2*3.1416*rm*h;
       System.out.println("Area: "+a);

       //Volumen
       v = (3.1416*h*h(3*rm-h))/3;
       System.out.println("Volumen: "+v);

       entrada.close();

    }
}
