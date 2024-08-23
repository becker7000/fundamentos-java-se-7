import java.util.Scanner;

public class Cadenas1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;

        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\n\t Escribe tu apellido: ");
        apellido = entrada.nextLine();

        System.out.print("\n\t Hola "+nombre+" "+apellido);
        System.out.print("\n\t Tu nombre tiene "+nombre.length()+" letras");
        System.out.print("\n\t La inicial de tu nombre es: "+nombre.charAt(0));

        entrada.close();

    }

}
