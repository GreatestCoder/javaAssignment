import java.util.Stack;
public class StackClassDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10); s.push(20);
        System.out.println("Peek: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Empty? " + s.empty());
    }
}
