import java.util.*;
public class ArrayListVsLinkedListPerf {
    public static void main(String[] args) {
        final int N = 20000;
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        // add at beginning
        long t1 = System.nanoTime();
        for (int i=0;i<N;i++) array.add(0, i);
        long t2 = System.nanoTime();
        for (int i=0;i<N;i++) linked.add(0, i);
        long t3 = System.nanoTime();
        System.out.println("ArrayList add at beginning: " + (t2-t1)/1e6 + " ms");
        System.out.println("LinkedList add at beginning: " + (t3-t2)/1e6 + " ms");
        // remove from middle
        int mid = N/2;
        t1 = System.nanoTime();
        for (int i=0;i<1000;i++) array.remove(mid);
        t2 = System.nanoTime();
        for (int i=0;i<1000;i++) linked.remove(mid);
        t3 = System.nanoTime();
        System.out.println("ArrayList remove from middle (1000 ops): " + (t2-t1)/1e6 + " ms");
        System.out.println("LinkedList remove from middle (1000 ops): " + (t3-t2)/1e6 + " ms");
        // iterate
        t1 = System.nanoTime();
        for (Integer x: array) { int y = x; }
        t2 = System.nanoTime();
        Iterator<Integer> it = linked.iterator();
        while (it.hasNext()) { int y = it.next(); }
        t3 = System.nanoTime();
        System.out.println("ArrayList iterate: " + (t2-t1)/1e6 + " ms");
        System.out.println("LinkedList iterate: " + (t3-t2)/1e6 + " ms");
    }
}
