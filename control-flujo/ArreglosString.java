public class ArreglosString {

    public static void main(String[] args) {

        String mensaje = "Hola mundo";
        char[] mensaje_arg = mensaje.toCharArray();

        System.out.printf("\n\t Primer elemento: %c",mensaje.charAt(0));
        System.out.printf("\n\t Primer elemento (arg): %c",mensaje_arg[0]);

    }

}
