import java.util.HashMap;
import java.util.Map;
public class CharFrequency {
    public static Map<Character,Integer> freq(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (Character.isWhitespace(c)) continue;
            m.put(c, m.getOrDefault(c,0)+1);
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(freq("hello world"));
    }
}
