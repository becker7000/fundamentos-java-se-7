public class Perro implements IMascota {

    private String nombre;

    public Perro(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido(){
        System.out.println("\n\t Guau guau!");
    }

    @Override
    public void moverse(){
        System.out.println("\n\t Moviendo cola...");
    }

}
