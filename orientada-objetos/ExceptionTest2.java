public class ExceptionTest2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int resultado;

        try{
            resultado = a / b;
            System.out.printf("\n\t Resultado: %d", resultado);
        }catch (ArithmeticException exception){
            System.out.print("\n\t No puede dividir por cero...");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }finally {
            System.out.print("\n\t Fin del programa...");
        }

    }

}
