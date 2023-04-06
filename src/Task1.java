import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String enteredMessage = scanner.nextLine();
        for (int i = 0; i < enteredMessage.length(); i++){
            System.out.println(enteredMessage.toUpperCase().charAt(i));
        }
    }
}
