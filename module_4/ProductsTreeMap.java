import java.util.TreeMap;
public class ProductsTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Apple", 1.0); products.put("Banana", 0.5); products.put("Carrot", 0.2);
        System.out.println("Products sorted by name: " + products);
    }
}
