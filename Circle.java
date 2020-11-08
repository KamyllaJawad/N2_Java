public class Circle extends Shape {
        private double radius;

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public Double getArea(){
            return 3.14 * (this.radius * this.radius);
        }

        public double earnings(){
            return Math.PI * radius * radius;
        }

        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }

}
