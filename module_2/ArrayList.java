package module_2;

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display elements
        System.out.println("List of integers: " + numbers);

        // Display using for-each loop
        System.out.println("Iterating through list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
