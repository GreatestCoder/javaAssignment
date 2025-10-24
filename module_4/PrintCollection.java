import java.util.Collection;
public class PrintCollection {
    public static <T> void printAll(Collection<T> col) {
        for (T x: col) System.out.println(x);
    }
    // simple demo
    public static void main(String[] args) {
        java.util.List<String> l = java.util.Arrays.asList("a","b","c");
        printAll(l);
    }
}
