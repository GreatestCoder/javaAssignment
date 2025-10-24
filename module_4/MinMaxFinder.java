import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;
    public MinMaxFinder(List<T> list) { this.list = list; }
    public T findMin() { return Collections.min(list); }
    public T findMax() { return Collections.max(list); }
    public static void main(String[] args) {
        MinMaxFinder<Integer> m1 = new MinMaxFinder<>(Arrays.asList(5,2,9,1));
        System.out.println("Min: " + m1.findMin() + ", Max: " + m1.findMax());
        MinMaxFinder<String> m2 = new MinMaxFinder<>(Arrays.asList("apple","pear","banana"));
        System.out.println("Min: " + m2.findMin() + ", Max: " + m2.findMax());
    }
}
