public class fortyeighth {
    public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256]; // ASCII range

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}
