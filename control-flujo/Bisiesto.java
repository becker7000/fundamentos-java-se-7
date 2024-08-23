import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int anio;

        System.out.print("\n\t Escribe el año: ");
        anio = Integer.parseInt(entrada.nextLine());

        if(anio%4==0 && (anio%100!=0 || anio%400==0)){
            System.out.printf("\n\t El año %d ES bisiesto",anio);
        }else{
            System.out.printf("\n\t El año %d NO es bisiesto",anio);
        }

        entrada.close();

    }

}
