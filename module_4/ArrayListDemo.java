import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("one"); arr.add("two"); arr.add("three");
        for (String s: arr) System.out.println(s);
    }
}
