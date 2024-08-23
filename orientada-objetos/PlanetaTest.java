public class PlanetaTest {

    public static void main(String[] args) {

        // Creando 4 objetos de la clase Planeta (instanciando objeto):
        Planeta planeta1 = new Planeta("Mercurio","café",1);
        Planeta planeta2 = new Planeta("Venus","anaranjado",2);
        Planeta planeta3 = new Planeta("Tierra","azul",3);
        Planeta planeta4 = new Planeta("Marte","rojo",4);

        // No se debe hacer:
        // planeta1.nombre = "Jupiter";

        // Usando un método personalizado:
        planeta1.mostrar();
        planeta2.mostrar();
        planeta3.mostrar();
        planeta4.mostrar();


    }

}
