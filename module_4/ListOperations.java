import java.util.ArrayList;
import java.util.List;
public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alpha"); list.add("beta"); list.add("gamma");
        System.out.println("After additions: " + list);
        list.remove("beta"); System.out.println("After remove by value: " + list);
        list.remove(1); System.out.println("After remove by index 1: " + list);
        list.add(1, "delta"); System.out.println("After add at index 1: " + list);
        list.set(0, "ALPHA"); System.out.println("After replace at index 0: " + list);
    }
}
