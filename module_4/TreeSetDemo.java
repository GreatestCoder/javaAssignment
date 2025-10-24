import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5); ts.add(1); ts.add(9); ts.add(3);
        System.out.println("TreeSet (sorted): " + ts);
        System.out.println("Smallest: " + ts.first() + ", Largest: " + ts.last());
        ts.remove(3);
        System.out.println("After remove 3: " + ts);
    }
}
