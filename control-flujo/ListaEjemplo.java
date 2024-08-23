import java.util.ArrayList;

public class ListaEjemplo {

    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Naranja");
        frutas.add("Sandía");
        frutas.add("Kiwi");
        frutas.add("Manzana");
        frutas.add("Pera");

        System.out.print("\n\t Lista frutas: "+frutas);

        frutas.remove(1);
        System.out.print("\n\t Lista frutas (actual): "+frutas);

        System.out.printf("\n\t La lista tiene %d frutas",frutas.size());
        System.out.printf("\n\t Primer fruta: %s",frutas.get(0));
        System.out.printf("\n\t Indice de Manzana: %d",frutas.indexOf("Manzana"));

        for(String fruta : frutas){
            System.out.printf("\n\t %s",fruta);
        }

    }

}
