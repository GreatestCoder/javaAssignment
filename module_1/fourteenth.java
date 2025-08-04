package submissions.module_1;

public class fourteenth {
    public static void main(String[] args) {
        int number = 5;

        // if-else
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // switch
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number not matched");
        }

        // for loop
        System.out.print("Counting: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
