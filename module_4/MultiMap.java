import java.util.*;
public class MultiMap<K,V> {
    private Map<K,List<V>> map = new HashMap<>();
    public void put(K k, V v) { map.computeIfAbsent(k, x-> new ArrayList<>()).add(v); }
    public List<V> get(K k) { return map.getOrDefault(k, Collections.emptyList()); }
    public static void main(String[] args) {
        MultiMap<String,Integer> mm = new MultiMap<>();
        mm.put("a",1); mm.put("a",2); mm.put("b",3);
        System.out.println(mm.get("a"));
    }
}
