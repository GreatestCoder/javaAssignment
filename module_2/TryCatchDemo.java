package module_2;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;

        // Example 1: try-catch
        try {
            int result = a / b; // Will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in try-catch: " + e.getMessage());
        }

        // Example 2: try-catch-finally
        try {
            int result = a / b; // Will cause ArithmeticException again
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (resource cleanup, etc.)");
        }

        System.out.println("Program continues after exception handling.");
    }
}

