public class Square extends Rectangle {
    public double side;

    public Square(String color, boolean filled, int i, double side)
    {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double earnings() {
        return side * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
