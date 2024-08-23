public class CirculoTest {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(4.5);
        circulo1.mostrar();

        Circulo circulo2 = new Circulo(8.5);
        circulo2.mostrar();

        double area1 = circulo1.calcularArea();
        System.out.printf("\n\t El área 1 es: %.3f",area1);

        double area2 = circulo2.calcularArea();
        System.out.printf("\n\t El área 2 es: %.3f",area2);

        double suma_areas = circulo1.sumarAreaCon(circulo2);
        System.out.printf("\n\t La suma de áreas es: %.3f",suma_areas);

        Circulo circulo3 = new Circulo(); // Circulo con radio = 1
        circulo3.mostrar();

        // Creando una copia del círculo 1
        Circulo circuloCopia1 = new Circulo(circulo1);
        circuloCopia1.mostrar();

        double area_triangulo = 30.45;
        double suma_areas_2 = circulo1.sumarAreaCon(area_triangulo);
        System.out.printf("\n\t La suma del área 1 con área triángulo es: %.3f",suma_areas_2);

        // Usado un método estático:
        Circulo.cuantosCirculosHay();

    }

}
