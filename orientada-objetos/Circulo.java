public class Circulo {

    double radio;
    static int cantidadDeCirculos=0;

    // Primer constructor
    public Circulo(double radio){
        this.radio = radio;
        cantidadDeCirculos++;
    }

    // Segundo constructor: (constructor por defecto)
    public Circulo(){
        this.radio = 1.0;
        cantidadDeCirculos++;
    }

    // Tercer constructor: (constructor creador de copias)
    public Circulo(Circulo c){
        this.radio = c.radio;
        cantidadDeCirculos++;
    }

    public double calcularArea(){
        double area;
        area = Math.PI*Math.pow(radio,2);
        return area;
    }

    public double sumarAreaCon(Circulo c){
        double areaTotal;
        areaTotal = this.calcularArea()+c.calcularArea();
        return areaTotal;
    }

    public double sumarAreaCon(double area){
        double areaTotal;
        areaTotal = this.calcularArea()+area;
        return areaTotal;
    }

    public static void cuantosCirculosHay(){
        System.out.printf("\n\t Al momento hay %d círculos",cantidadDeCirculos);
    }

    void mostrar(){
        System.out.printf("\n\t Circulo{ radio:%.3f }",radio);
    }

}
