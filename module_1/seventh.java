package submissions.module_1;

class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an Animal.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void showNames() {
        System.out.println("Child class name: " + this.name);
        System.out.println("Parent class name: " + super.name);
    }

    void display() {
        super.display();  // Call parent method
        System.out.println("This is a Dog.");
    }
}

public class seventh {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showNames();
        d.display();
    }
}
