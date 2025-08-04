class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class thirtyeighth {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 22);
        Student s2 = new Student(s1); // Copy constructor

        s1.display();
        s2.display();
    }
}
