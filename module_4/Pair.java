// Generic Pair class
public class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public String toString() { return "Pair[" + key + ", " + value + "]"; }
    // Simple test
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("age", 21);
        System.out.println(p);
    }
}
