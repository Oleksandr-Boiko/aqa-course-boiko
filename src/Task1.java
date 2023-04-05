import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String enteredMessage = scanner.nextLine();
        String[] array = enteredMessage.split(" ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].toUpperCase());
        }
    }
}
