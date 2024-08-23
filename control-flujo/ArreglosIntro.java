import java.util.Arrays;

public class ArreglosIntro {

    public static void main(String[] args) {

        int[] enteros = {17,76,4,19,40};
        int[] enteros2 = new int[4]; // Arreglo vacío de 4 elementos

        System.out.printf("\n\t Elemento 2: %d",enteros[1]);
        System.out.printf("\n\t Tamaño del arreglo: %d",enteros.length);
        int suma = enteros[0]+enteros[1]+enteros[2]+enteros[3]+enteros[4];
        System.out.printf("\n\t La suma de todos los elementos es: %d",suma);
        System.out.printf("\n\t Primer elemento: %d",enteros[0]); // Lógica 0
        System.out.printf("\n\t Último elemento: %d",enteros[enteros.length-1]);
        // System.out.printf("\n\t Indice 5: %d",enteros[5]);
        System.out.printf("\n\t Arreglo completo: %s",Arrays.toString(enteros));


    }

}
