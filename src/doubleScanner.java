import java.util.Scanner;

public class doubleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        double enteredValue = scanner.nextDouble();
        if (enteredValue % 2 == 0) {
            System.out.println("Entered value " + enteredValue + " is even");
        }
        else {
            System.out.println("Entered value " + enteredValue + " is odd");
        }
    }
}
