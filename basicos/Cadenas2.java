import java.util.Scanner;

public class Cadenas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto1;
        String texto2;

        System.out.print("\n\t Escribe el texto 1: ");
        texto1 = entrada.nextLine();

        System.out.print("\n\t Escribe el texto 2: ");
        texto2 = entrada.nextLine();

        System.out.print("\n\t Los textos son iguales? R: "+texto1.equals(texto2));
        System.out.print("\n\t Textos concatenados: "+texto1.concat(" ").concat(texto2));

        entrada.close();

    }

}
