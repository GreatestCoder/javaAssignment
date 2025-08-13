package module_2;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }

    // Method declares it may throw an exception
    public static long factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Number must not be negative."); // throw keyword
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

