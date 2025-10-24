import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("a"); hs.add("b"); hs.add("a"); // duplicate
        System.out.println("HashSet contents (duplicates ignored): " + hs);
    }
}
