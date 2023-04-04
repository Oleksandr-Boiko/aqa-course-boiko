import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();
        int factorial = enteredValue;
        for (int i = enteredValue; i > 1; i--){
            factorial*= (i - 1);
        }
        System.out.println(factorial);
    }
}
