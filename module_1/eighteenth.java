package submissions.module_1;

public class eighteenth {
    public static void main(String[] args) {
        int[] arr = {23, 5, 89, 1, 34, 99, -10};
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
