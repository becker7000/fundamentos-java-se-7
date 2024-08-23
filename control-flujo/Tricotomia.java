import java.util.Scanner;

public class Tricotomia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe el número entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>0){
            System.out.println("\n\t POSITIVO!");
        }else if(entero<0){
            System.out.println("\n\t NEGATIVO!");
        }else{
            System.out.println("\n\t CERO!");
        }

        entrada.close();

    }

}
