import java.util.Scanner;

public class DistanciaCaracter {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;
        int distancia;

        System.out.print("\n\t Escribe una letra: ");
        letra = entrada.nextLine().charAt(0);

        distancia = 'z'-letra;
        System.out.printf("\n\t La letra %c esta a %d letras de z",letra,distancia);

        entrada.close();
    }

}
