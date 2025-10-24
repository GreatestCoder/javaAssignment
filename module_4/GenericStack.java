// Generic Stack implementation
import java.util.ArrayList;
import java.util.EmptyStackException;
public class GenericStack<T> {
    private ArrayList<T> data = new ArrayList<>();
    public void push(T item) { data.add(item); }
    public T pop() {
        if (data.isEmpty()) throw new EmptyStackException();
        return data.remove(data.size()-1);
    }
    public T peek() {
        if (data.isEmpty()) throw new EmptyStackException();
        return data.get(data.size()-1);
    }
    public boolean isEmpty() { return data.isEmpty(); }
    public static void main(String[] args) {
        GenericStack<Integer> s1 = new GenericStack<>();
        s1.push(10); s1.push(20);
        System.out.println(s1.pop()); // 20
        GenericStack<String> s2 = new GenericStack<>();
        s2.push("x"); s2.push("y");
        System.out.println(s2.peek()); // y
    }
}
