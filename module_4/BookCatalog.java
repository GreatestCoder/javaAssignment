import java.util.HashMap;
import java.util.Map;
public class BookCatalog {
    private Map<String,String> books = new HashMap<>();
    public void add(String title, String author) { books.put(title, author); }
    public String findByTitle(String title) { return books.get(title); }
    public static void main(String[] args) {
        BookCatalog bc = new BookCatalog();
        bc.add("Hamlet","Shakespeare"); 
        System.out.println(bc.findByTitle("Hamlet"));
    }
}
