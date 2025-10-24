import java.util.ArrayDeque;
public class PalindromeDeque {
    public static boolean isPalindrome(String s) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c: s.toCharArray()) if (!Character.isWhitespace(c)) dq.addLast(Character.toLowerCase(c));
        while (dq.size()>1) {
            if (!dq.removeFirst().equals(dq.removeLast())) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
    }
}
