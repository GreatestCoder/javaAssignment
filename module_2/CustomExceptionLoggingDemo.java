package module_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CustomExceptionLoggingDemo {
    private static final Logger logger = Logger.getLogger("AgeLogger");

    public static void main(String[] args) {
        setupLogger();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
            System.out.println("You are eligible.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
            logger.severe("Invalid age entered: " + age + " - " + e.getMessage());
        }

        sc.close();
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    private static void setupLogger() {
        try {
            FileHandler fh = new FileHandler("error.log", true); // Append mode
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (IOException e) {
            System.out.println("Failed to set up logger: " + e.getMessage());
        }
    }
}

