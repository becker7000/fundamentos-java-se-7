public class ExceptionTest1 {

    public static void main(String[] args) {

        String salario_cadena = "70000edn";
        double salario_decimal;

        try{
            salario_decimal = Double.parseDouble(salario_cadena);
            System.out.printf("\n\t El sueldo es: $ %.2f", salario_decimal);
        }catch (NumberFormatException exception){
            System.out.print("\n\t Error al transformar el texto a número...");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }
    }

}
