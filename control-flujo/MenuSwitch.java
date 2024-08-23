import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print("\n\t Selecciona el día: ");
        System.out.print("\n\t 1. Lunes");
        System.out.print("\n\t 2. Martes");
        System.out.print("\n\t 3. Miércoles");
        System.out.print("\n\t 4. Jueves");
        System.out.print("\n\t => ");
        opcion = Integer.parseInt(entrada.nextLine());

        switch (opcion){
            case 1:
                System.out.println("\n\t Seleccionaste el día lunes");
                break;
            case 2:
                System.out.println("\n\t Seleccionaste el día martes");
                break;
            case 3:
                System.out.println("\n\t Seleccionaste el día miércoles");
                break;
            case 4:
                System.out.println("\n\t Seleccionaste el día jueves");
                break;
            default:
                System.out.println("\n\t El día que seleccionaste, no esta contemplado.");
                break;
        }

        entrada.close();

    }

}
