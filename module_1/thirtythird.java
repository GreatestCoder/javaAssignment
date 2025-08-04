public class thirtythird {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        // Reference comparison
        System.out.println("s1 == s2: " + (s1 == s2)); // false

        // Value comparison
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
    }
}
