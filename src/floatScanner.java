import java.util.Scanner;

public class floatScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        float enteredValue = scanner.nextFloat();
        if (enteredValue % 2 == 0 && enteredValue > 10 || enteredValue == 15) {
            System.out.println("First message");
        }
        else {
            System.out.println("Second message");
        }
    }
}
