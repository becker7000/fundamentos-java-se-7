import java.util.Scanner;

public class LeyGravitacionUniversal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final double G = 6.67430e-11;
        double masa1; // kg
        double masa2;
        double radio; // metros
        double fuerza;

        System.out.print("\n\t Escribe la masa 1: ");
        masa1 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe la masa 2: ");
        masa2 = Double.parseDouble(entrada.nextLine());

        System.out.print("\n\t Escribe el radio: ");
        radio = Double.parseDouble(entrada.nextLine());

        fuerza = G*(masa1*masa2/Math.pow(radio,2));

        System.out.printf("\n\t La fuerza gravitacional entre las dos masa es: %.2e Nm2/kg2",fuerza);

        entrada.close();

    }

}
