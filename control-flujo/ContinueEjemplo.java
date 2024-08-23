public class ContinueEjemplo {

    public static void main(String[] args) {

        int i = 1;

        while(i<=10){
            if(i==4 || i==9){
                i++;
                continue; // Ignora lo que sigue...
            }
            System.out.printf("\n\t i = %d",i);
            i++;
        }

    }

}
