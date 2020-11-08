public class CircleTest {
    public static void main(String[] args) {
        Circle Circle = new Circle(

                "red",true, 1.0
        );
        System.out.println("Cor: " + Circle.getColor());
        System.out.println("Preenchimento: " + Circle.isFilled());
        System.out.println("Raio: " + Circle.getRadius());
        System.out.println("Area: " + Circle.getArea());
        System.out.println("Perimetro: " + Circle.earnings());
    }
}
