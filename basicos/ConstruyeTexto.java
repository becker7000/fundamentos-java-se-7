import java.util.Scanner;

public class ConstruyeTexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String noCliente;
        StringBuilder bienvenida = new StringBuilder();

        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\n\t Escribe tu apellido: ");
        apellido = entrada.nextLine();

        System.out.print("\n\t Escribe tu número de cliente: ");
        noCliente = entrada.nextLine();

        bienvenida.append("\n\t ¡Hola, "+nombre+" "+apellido+"!");
        bienvenida.append("\n\t ¡Bienvenid@ a tu nueva suscripción de Streaming!");
        bienvenida.append("\n\t Estamos encantados de tenerte con nosotros.");
        bienvenida.append("\n\t Tu número de cliente es: "+noCliente);
        bienvenida.append("\n\t Disfruta tu experiencia, siente libre de contactarnos.");

        System.out.printf("\n"+bienvenida);

        // Nota: en caso de querer guardar el texto en un String habría que transformarlo:
        String texto = bienvenida.toString();

        entrada.close();

    }

}
