abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length = 5, breadth = 3;

    @Override
    double area() {
        return length * breadth;
    }
}

public class fortyfourth {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        System.out.println("Area of Rectangle: " + rect.area());
    }
}
