package submissions.module_1;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class eighth {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);

        s1.display();
        s2.display();
    }
}
