package submissions.module_1;

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;
    Circle(double r) {
        radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class third {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area: " + s.area());
    }
}