import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();
        if (enteredValue == 0) {
            System.out.println("Your value equals 0");
        } else if (enteredValue > 10) {
            System.out.println("Your value is more than 10");
        } else if (enteredValue < 10) {
            System.out.println("Your value is less than 10");
        }
        else {
            System.out.println("Your value is equals 10");
        }
    }
}
