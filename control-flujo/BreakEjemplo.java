import java.util.Scanner;

public class BreakEjemplo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion=0;

        while (true){ // Ciclo infinito
            System.out.print("\n\t Algun proceso...");
            System.out.print("\n\t 1.Repetir | 2.Salir");
            System.out.print("\n\t Opción: ");
            opcion = Integer.parseInt(entrada.nextLine());
            if(opcion==2){
                break;
            }
        }

        System.out.println("\n\t Fin del programa...");

        entrada.close();
    }

}
