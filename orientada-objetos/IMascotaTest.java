public class IMascotaTest {

    public static void main(String[] args) {

        // Creando 2 objetos interfaz:

        IMascota mascota1 = new Gato("Coco");
        IMascota mascota2 = new Perro("Capitan");

        // Usando métodos implementados de forma distinta:

        mascota1.hacerSonido();
        mascota1.moverse();

        mascota2.hacerSonido();
        mascota2.moverse();

    }

}
