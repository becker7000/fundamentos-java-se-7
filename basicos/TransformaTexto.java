import java.util.Locale;
import java.util.Scanner;

public class TransformaTexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String textoMinus;
        String textoMayus;

        System.out.print("\n\t Escribe un texto en minúsculas: ");
        textoMinus = entrada.nextLine();

        textoMayus = textoMinus.toUpperCase(Locale.ROOT);
        System.out.print("\n\t El texto en mayusculas es: "+textoMayus);

        entrada.close();

    }

}
