import java.util.TreeMap;
public class TreeMapGrades {
    public static void main(String[] args) {
        TreeMap<String,Integer> grades = new TreeMap<>();
        grades.put("Alice", 85); grades.put("Bob", 91); grades.put("Cara", 78);
        System.out.println("Grades sorted by name: " + grades);
    }
}
