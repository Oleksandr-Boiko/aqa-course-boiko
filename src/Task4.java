import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int enteredValue = scanner.nextInt();
        while (enteredValue <= 0 || enteredValue > 140) {
            System.out.println("Error: Wrong age");
            System.out.println("Enter your age again: ");
            enteredValue = scanner.nextInt();
        }
            System.out.println("Your age is valid");
    }
}
