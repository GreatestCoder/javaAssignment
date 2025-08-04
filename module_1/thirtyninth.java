class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

public class thirtyninth {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 101);
        emp.showDetails();
    }
}
