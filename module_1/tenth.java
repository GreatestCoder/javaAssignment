package submissions.module_1;

final class Vehicle {
    final int speedLimit = 100;

    final void displaySpeed() {
        System.out.println("Speed limit is: " + speedLimit);
    }
}



public class tenth {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displaySpeed();
    }
}
