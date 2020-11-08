public class RectangleTest {
    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle(
                "Black", true, 6.0, 10
        );

        System.out.println("Cor: " + Rectangle.getColor());
        System.out.println("Preenchido: " + Rectangle.isFilled());
        System.out.println("Largura: " + Rectangle.getWidth());
        System.out.println("Altura: " + Rectangle.getLength());
        System.out.println("Area: " + Rectangle.earnings());
        System.out.println("Perimetro: " + Rectangle.earnings1());
    }
}
