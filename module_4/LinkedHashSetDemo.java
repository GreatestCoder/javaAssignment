import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one"); lhs.add("two"); lhs.add("three");
        System.out.println("LinkedHashSet iteration (insertion order):");
        for (String s: lhs) System.out.println(s);
    }
}
