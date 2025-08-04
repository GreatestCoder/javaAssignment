package submissions.module_1;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class second {
    public static void main(String[] args) {
        Animal a = new Dog(); // polymorphism
        a.makeSound(); // Outputs: Dog barks
    }
}