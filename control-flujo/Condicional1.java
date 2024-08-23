import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("\n\t Escribe un número positivo: ");
        numero = Integer.parseInt(entrada.nextLine());

        if(numero>0){
            System.out.println("\n\t El número es posivito...");
        }

        if(numero<0){
            System.out.println("\n\t El número es negativo...");
        }

        if(numero==0){
            System.out.println("\n\t El número es cero...");
        }

        entrada.close();

    }

}
