import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();
        if (enteredValue < 0) {
            System.out.println("Error: Entered value is negative");
        }
        for (int i = 0; i <= enteredValue; i++){
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("The number is even");
            } else if (i % 3 == 0) {
                System.out.println("The number multiple to 3");
            }
        }
    }
}
