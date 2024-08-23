import java.util.Scanner;

public class ReciboConsumoElectrico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final double TARIFA1 = 1.2;
        final double TARIFA2 = 1.5;
        final double TARIFA3 = 1.8;
        double tarifa;
        double consumo;
        double monto_pagar;
        StringBuilder reporte = new StringBuilder();

        System.out.print("\n\t Escribe tu consumo eléctrico: ");
        consumo = Double.parseDouble(entrada.nextLine());

        if(consumo<800){
            tarifa = TARIFA1;
        }else if(consumo<=1450){
            tarifa = TARIFA2;
        }else{
            tarifa = TARIFA3;
        }

        monto_pagar = tarifa*consumo;

        reporte.append("\n\t Reporte de consumo eléctrico: ");
        reporte.append("\n\t "+String.format("Consumo: %.3f kWh",consumo));
        reporte.append("\n\t "+String.format("Tarifa: $ %.2f por kWh",tarifa));
        reporte.append("\n\t "+String.format("Monto a pagar: $ %.2f",monto_pagar));
        reporte.append("\n\t Cuida tu consumo de electricidad...");

        // Se muestra el reporte:
        System.out.println(reporte);

        entrada.close();
    }

}
