package module_2;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class MethodReferenceSquare {

    // Static method to find square
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Method reference to static method
        Square sq = MethodReferenceSquare::square;

        int number = 7;
        int result = sq.calculate(number);

        System.out.println("Square of " + number + " is: " + result);
    }
}

