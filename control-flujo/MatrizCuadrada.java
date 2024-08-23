public class MatrizCuadrada {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2},
                {3,4}
        }; // 1*4 - 3*2

        System.out.printf("\n\t M[0][0]: %d",matriz[0][0]);
        int determinante = matriz[0][0]*matriz[1][1]-matriz[1][0]*matriz[0][1];

        System.out.printf("\n\t La determinante es: %d",determinante);

    }

}
