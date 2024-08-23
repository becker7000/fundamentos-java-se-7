import java.util.Scanner;

public class Multiplo7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un multiplo de 7: ");
        entero = Integer.parseInt(entrada.nextLine());

        // -14,-7,0,7,14,21,28,35,42,49,...
        if(entero%7==0){
            System.out.println("\n\t El entero es múltiplo de 7...");
        }else{
            System.out.println("\n\t El entero NO es múltiplo de 7...");
        }

        entrada.close();

    }

}
