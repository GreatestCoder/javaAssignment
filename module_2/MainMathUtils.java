package module_2;
import module_2.utilities.MathUtils;

public class MainMathUtils {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        int sum = mathUtils.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}