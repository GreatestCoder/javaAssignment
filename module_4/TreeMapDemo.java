import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("c",3); tm.put("a",1); tm.put("b",2);
        System.out.println("TreeMap (keys sorted): " + tm);
    }
}
