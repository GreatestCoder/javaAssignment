import java.util.LinkedHashMap;
import java.util.Map;
public class LruCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }
    public static void main(String[] args) {
        LruCache<Integer,String> cache = new LruCache<>(3);
        cache.put(1,"one"); cache.put(2,"two"); cache.put(3,"three");
        cache.get(1); // access
        cache.put(4,"four"); // evicts least recently used (2)
        System.out.println(cache);
    }
}
