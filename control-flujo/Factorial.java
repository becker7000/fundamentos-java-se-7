import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int factorial=1; // Va a guardar una multiplicación
        int entero;

        System.out.print("\n\t Calcular el factorial de: ");
        entero = Integer.parseInt(entrada.nextLine());

        for(int i=entero;i>=1;i--){
            factorial*=i;
        }

        System.out.printf("\n\t %d! = %d",entero,factorial);

        entrada.close();
    }

}

//  4! = 4*3*2*1 = 24
