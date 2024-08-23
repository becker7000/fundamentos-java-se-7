import java.util.Scanner;

public class VolumenCirculo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double PI = 3.1415926535;
        double radio;
        double volumen;

        System.out.print("\n\t Escribe el radio de la esfera: ");
        radio = Double.parseDouble(entrada.nextLine());

        volumen = (4.0/3.0)*Math.PI*Math.pow(radio,3);

        System.out.printf("\n\t El volumen de la esfera es: %.4f",volumen);

        entrada.close();

    }

}
