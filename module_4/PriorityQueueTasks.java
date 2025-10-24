import java.util.PriorityQueue;
public class PriorityQueueTasks {
    static class Task implements Comparable<Task> {
        String name; int priority;
        Task(String n, int p) { name=n; priority=p; }
        public int compareTo(Task o) { return Integer.compare(o.priority, this.priority); } // higher first
        public String toString(){ return name+"("+priority+")"; }
    }
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("low",1));
        pq.add(new Task("high",10));
        pq.add(new Task("mid",5));
        System.out.println("Queue peek: " + pq.peek());
        System.out.println("Poll highest-priority: " + pq.poll());
        System.out.println("Remaining: " + pq);
    }
}
