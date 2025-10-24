import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("z","b","a","m"));
        Collections.sort(list);
        System.out.println("Alphabetical: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse alphabetical: " + list);
    }
}
