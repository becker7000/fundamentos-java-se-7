public class SumaGauss {

    public static void main(String[] args) {

        int contador=1;
        int suma=0;

        while(contador<=100){
            suma+=contador;
            contador++;
        }

        System.out.printf("\n\t La suma final es: %d",suma);

    }

}
