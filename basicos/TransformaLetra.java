import java.util.Scanner;

public class TransformaLetra {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra minuscula: ");
        letra = entrada.nextLine().charAt(0);

        System.out.printf("\n\t La letra %c en mayuscula es: %c",letra,letra-32);

        entrada.close();
    }

}
