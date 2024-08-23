public class DadoSwitch {

    public static void main(String[] args) {

        int dado = (int)(Math.random()*6+1);
        //System.out.printf("\n\t Dado: %d",dado);

        switch (dado){
            case 1:
                System.out.print("\n\t * * * * * *");
                System.out.print("\n\t *         *");
                System.out.print("\n\t *    *    *");
                System.out.print("\n\t *         *");
                System.out.print("\n\t * * * * * *");
                break;
            case 2:
                System.out.print("\n\t * * * * * *");
                System.out.print("\n\t *     *   *");
                System.out.print("\n\t *         *");
                System.out.print("\n\t *  *      *");
                System.out.print("\n\t * * * * * *");
                break;
            // TODO: terminar los casos 3 a 6
        }

    }

}
