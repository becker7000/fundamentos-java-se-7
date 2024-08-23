import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float masa;
        float estatura;
        float imc;

        System.out.print("\n\t Escribe tu masa (kg): ");
        masa = Float.parseFloat(entrada.nextLine());

        System.out.print("\n\t Escribe tu estatura (m): ");
        estatura = Float.parseFloat(entrada.nextLine());

        imc = masa/(estatura*estatura);

        System.out.printf("\n\t Tu indice de masa corporal es: %.3f",imc);

        entrada.close();

    }

}
