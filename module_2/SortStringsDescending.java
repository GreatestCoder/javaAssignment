package module_2;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringsDescending {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding names
        names.add("Naman");
        names.add("Aarav");
        names.add("Ishaan");
        names.add("Karan");
        names.add("Priya");

        System.out.println("Original List: " + names);

        // Sort in descending order using lambda
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted in Descending Order: " + names);
    }
}
