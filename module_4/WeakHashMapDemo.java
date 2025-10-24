import java.util.WeakHashMap;
public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Object,String> whm = new WeakHashMap<>();
        Object key = new Object();
        whm.put(key, "value"); 
        System.out.println("Before GC: " + whm);
        key = null;
        System.gc();
        Thread.sleep(100);
        System.out.println("After GC (may be empty): " + whm);
    }
}
