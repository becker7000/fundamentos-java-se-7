import java.util.Scanner;

public class DistanciaPuntos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double x1, y1, x2, y2;
        double distancia;

        System.out.print("\n\t x1: ");
        x1 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t y1: ");
        y1 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t x2: ");
        x2 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t y2: ");
        y2 = Double.parseDouble(entrada.nextLine());

        distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.printf("\n\t La distancia entre los puntos es: %.3f",distancia);

        entrada.close();

    }

}
