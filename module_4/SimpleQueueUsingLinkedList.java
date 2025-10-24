import java.util.LinkedList;
public class SimpleQueueUsingLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(int x) { list.addLast(x); }
    public int dequeue() { return list.removeFirst(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public static void main(String[] args) {
        SimpleQueueUsingLinkedList q = new SimpleQueueUsingLinkedList();
        q.enqueue(1); q.enqueue(2);
        System.out.println(q.dequeue());
    }
}
