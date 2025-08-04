import java.util.*;

public class thirtyfirst {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 5, 8, 2, 9};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}
