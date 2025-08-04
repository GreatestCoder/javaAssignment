package submissions.module_1;

class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    // Method Overriding
    @Override
    int add(int a, int b) {
        return super.add(a, b) + 10;
    }
}

public class fourth {
    public static void main(String[] args) {
        Calculator c = new AdvancedCalculator();
        System.out.println("Add Int: " + c.add(5, 3)); // Overridden
        System.out.println("Add Double: " + c.add(2.5, 3.5)); // Overloaded
    }
}
