final class Base {
    final void show() {
        System.out.println("Final method in a final class.");
    }
}


public class fortyfifth {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();
    }
}
