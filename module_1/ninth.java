package submissions.module_1;

class AccessExample {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    void showAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class ninth {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.showAccess();
        System.out.println("Accessing public: " + obj.publicVar);
        // System.out.println(obj.privateVar); // Not accessible
        System.out.println("Accessing protected: " + obj.protectedVar);
        System.out.println("Accessing default: " + obj.defaultVar);
    }
}
