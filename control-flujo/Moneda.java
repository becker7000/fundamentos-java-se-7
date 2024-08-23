public class Moneda {

    public static void main(String[] args) {

        // Math.random() siempre genera un valor entre 0.000000 y 0.999999
        // 0 - 1
        int moneda = (int)(Math.random()*2);

        // Test:
        // System.out.printf("\n\t Moneda: %d",moneda);

        if(moneda==0){
            System.out.println("\n\t SOOOOL!");
        }else{
            System.out.println("\n\t ÁGUILAA!");
        }

    }

}
