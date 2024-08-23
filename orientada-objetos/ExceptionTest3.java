public class ExceptionTest3 {

    public static void main(String[] args) {

        int[] numeros = {4,8,5,7,3};

        try{
            System.out.printf("\n\t Elemento 6: %d", numeros[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.print("\n\t Elemento no válido");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }

    }

}
