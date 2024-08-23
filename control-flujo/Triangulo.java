import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int niveles;
        int i=0;

        System.out.print("\n\t Cuantos niveles? => ");
        niveles = Integer.parseInt(entrada.nextLine());

        while(i<niveles){
            System.out.println(); // Salto de línea
            int j=0; // Variable local al ciclo while
            while(j<=i){
                System.out.print("\t #");
                j++;
            }
            i++;
        }

        entrada.close();

    }

}

/*
*  3 niveles
*
*  #
*  # #
*  # # #
*
* */