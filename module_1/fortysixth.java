class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast");
    }
}

public class fortysixth {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // Upcasting
        v.run(); // Calls Bike's run() at runtime
    }
}
