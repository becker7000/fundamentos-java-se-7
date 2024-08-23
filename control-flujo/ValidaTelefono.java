import java.util.Scanner;

public class ValidaTelefono {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String telefono;

        System.out.print("\n\t Escribe un número telefonico: ");
        telefono = entrada.nextLine();

        if(telefono.length()==10){
            System.out.println("\n\t El telefono tiene 10 dígitos...");
        }else{
            System.out.println("\n\t El telefono debe tener 10 dígitos...");
        }

        entrada.close();

    }

}
