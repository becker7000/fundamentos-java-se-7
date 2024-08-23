import java.util.ArrayList;

public class ClinicaDeportivaTest {

    public static void main(String[] args) {

        Persona medico1 = new Medico("Eduardo","5501928374","Neurología");
        Persona medico2 = new Medico("Laura","5512341234","Cardiología");
        Persona medico3 = new Medico("Luis","778172635364","Pediatría");
        Persona deportista1 = new Deportista("Zeus","5591827366","Natación");
        Persona deportista2 = new Deportista("Daniela","5581726372","Atletismo");
        Persona deportista3 = new Deportista("Eder","7781728199","Soccer");

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(medico1);
        listaPersonas.add(medico2);
        listaPersonas.add(medico3);
        listaPersonas.add(deportista1);
        listaPersonas.add(deportista2);
        listaPersonas.add(deportista3);

        for(Persona persona : listaPersonas){
            persona.mostrar();
        }

    }

}
