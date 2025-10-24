import java.util.ArrayDeque;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.addFirst("a"); dq.addLast("b"); dq.addFirst("c"); 
        System.out.println("Deque: " + dq);
        System.out.println("Remove first: " + dq.removeFirst());
        System.out.println("Remove last: " + dq.removeLast());
        System.out.println("Peek first: " + dq.peekFirst() + ", Peek last: " + dq.peekLast());
    }
}
