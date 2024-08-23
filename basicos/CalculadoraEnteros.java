import java.util.Scanner;

public class CalculadoraEnteros {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;

        System.out.print("\n\t Escribe el valor de a: ");
        a = Integer.parseInt(entrada.nextLine());

        System.out.print("\n\t Escribe el valor de b: ");
        b = Integer.parseInt(entrada.nextLine());

        System.out.printf("\n\t %d + %d = %d",a,b,a+b);
        System.out.printf("\n\t %d - %d = %d",a,b,a-b);
        System.out.printf("\n\t %d * %d = %d",a,b,a*b);
        System.out.printf("\n\t %d / %d = %d",a,b,a/b);
        System.out.printf("\n\t %d resto %d = %d",a,b,a%b);

    }

}
