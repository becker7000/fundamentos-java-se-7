import java.util.Scanner;

public class MiniLogin {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String password = "java12345";
        String pass_user;

        System.out.print("\n\t Escribe la contraseña: ");
        pass_user = entrada.nextLine();

        if(pass_user.isEmpty() || pass_user.isBlank()){
            System.out.println("\n\t La contraseña está vacía o son espacios en blanco...");
        }else{
            if(pass_user.equals(password)){
                System.out.println("\n\t Acceso concedido...");
            }else {
                System.out.println("\n\t Contraseña incorrecta, acceso denegado...");
            }
        }

        entrada.close();

    }

}
