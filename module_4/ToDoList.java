import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Buy milk"); tasks.add("Call mom");
        System.out.println("Tasks: " + tasks);
        tasks.add("Read book"); tasks.remove("Buy milk"); 
        System.out.println("After update: " + tasks);
    }
}
