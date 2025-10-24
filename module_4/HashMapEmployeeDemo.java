import java.util.HashMap;
import java.util.Map;
public class HashMapEmployeeDemo {
    public static void main(String[] args) {
        Map<Integer,String> emp = new HashMap<>();
        emp.put(101, "Alice"); emp.put(202, "Bob"); emp.put(303, "Cara");
        System.out.println("Contains key 202? " + emp.containsKey(202));
        System.out.println("Iterate using keySet:");
        for (Integer k: emp.keySet()) System.out.println(k + " -> " + emp.get(k));
        System.out.println("Iterate using entrySet:");
        for (Map.Entry<Integer,String> e: emp.entrySet()) System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
