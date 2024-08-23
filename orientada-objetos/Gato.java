public class Gato implements IMascota {

    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido(){
        System.out.println("\n\t Miaw miaw!");
    }

    @Override
    public void moverse(){
        System.out.println("\n\t Dormir, dormir...");
    }

}
