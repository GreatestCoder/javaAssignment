package module_2;

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;

        // Lambda for subtraction
        Calculator subtract = (a, b) -> a - b;

        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;

        // Test the lambdas
        System.out.println("Addition: " + add.compute(10, 5));
        System.out.println("Subtraction: " + subtract.compute(10, 5));
        System.out.println("Multiplication: " + multiply.compute(10, 5));
    }
}

