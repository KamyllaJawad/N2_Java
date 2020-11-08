public class Rectangle extends Shape {
        private double width;
        private double length;

    public Rectangle(String color, boolean filled, double length, double width)
    {
        super(color, filled);
        this.length = length;
        this.width = width;

        setLength(length);
        setWidth(width);

    }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double earnings() {
            return (width * 2) + (length * 2);
        }
        public double earnings1(){
            return width * length;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", length=" + length +
                    '}';
        }

}
