import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;

        System.out.print("\n\t Escribe un número entero: ");
        a = Integer.parseInt(entrada.nextLine());

        System.out.print("\n\t Escribe otro número entero: ");
        b = Integer.parseInt(entrada.nextLine());

        if(a>b){
            System.out.printf("\n\t %d es mayor que %d",a,b);
        }

        if(b>a){
            System.out.printf("\n\t %d es mayor que %d",b,a);
        }

        if(a==b){
            System.out.println("\n\t Ambos enteros son iguales...");
        }

        entrada.close();

    }

}
