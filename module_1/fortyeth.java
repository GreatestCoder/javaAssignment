static void greet() {
        System.out.println("Hello from static method!");
    }

    void showMessage() {
        System.out.println("Hello from non-static method!");
    }
}

public class StaticNonStaticDemo {
    public static void main(String[] args) {
        Utility.greet(); // Static method call

        Utility obj = new Utility();
        obj.showMessage(); // Non-static method call
    }
}
