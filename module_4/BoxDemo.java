// Generic Box with addItem and getItem methods
public class Box<T> {
    private T item;
    public void addItem(T item) { this.item = item; }
    public T getItem() { return item; }
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.addItem("Hello");
        System.out.println("Box<String> contains: " + b1.getItem());
        Box<Integer> b2 = new Box<>();
        b2.addItem(123);
        System.out.println("Box<Integer> contains: " + b2.getItem());
    }
}
