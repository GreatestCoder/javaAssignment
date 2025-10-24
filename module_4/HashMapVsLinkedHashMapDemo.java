import java.util.*;
public class HashMapVsLinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("b",2); hm.put("a",1); hm.put("c",3);
        Map<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("b",2); lhm.put("a",1); lhm.put("c",3);
        System.out.println("HashMap iteration order: " + hm);
        System.out.println("LinkedHashMap iteration order: " + lhm);
    }
}
