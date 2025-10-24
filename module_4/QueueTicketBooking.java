import java.util.LinkedList;
import java.util.Queue;
public class QueueTicketBooking {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Alice"); q.add("Bob"); q.add("Cara");
        while (!q.isEmpty()) {
            System.out.println("Processing ticket for: " + q.poll());
        }
    }
}
