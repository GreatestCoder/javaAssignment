import java.util.PriorityQueue;
public class MergePriorityQueues {
    public static PriorityQueue<Integer> merge(PriorityQueue<Integer> a, PriorityQueue<Integer> b) {
        PriorityQueue<Integer> res = new PriorityQueue<>(a);
        res.addAll(b);
        return res;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>(); p1.add(3); p1.add(1);
        PriorityQueue<Integer> p2 = new PriorityQueue<>(); p2.add(2); p2.add(0);
        System.out.println(merge(p1,p2));
    }
}
