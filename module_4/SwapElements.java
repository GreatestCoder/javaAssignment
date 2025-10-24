// Generic method to swap two elements in an array
import java.util.Arrays;
public class SwapElements {
    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        swap(a, 1, 3);
        System.out.println(Arrays.toString(a));
        String[] s = {"a","b","c"};
        swap(s, 0, 2);
        System.out.println(Arrays.toString(s));
    }
}
