import java.util.Scanner;

public class DoWhile1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print("\n\t Menú: ");
        System.out.print("\n\t 1. Ver lista de productos");
        System.out.print("\n\t 2. Buscar un producto");
        System.out.print("\n\t 3. Agregar un producto");
        System.out.print("\n\t 4. Modificar un producto");
        System.out.print("\n\t 5. Eliminar un producto");
        System.out.print("\n\t 6. Salir");

        do{ // Filtro para enteros de 1 a 6:
            System.out.print("\n\t Opción [1-6]: ");
            opcion = Integer.parseInt(entrada.nextLine());
        }while(opcion<1 || opcion>6);

        System.out.println("\n\t Opción válida...");

        entrada.close();

    }

}
