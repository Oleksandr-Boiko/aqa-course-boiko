import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String enteredMessage = scanner.nextLine();
        String[] array = enteredMessage.split(" ");
        for (int i = 0; i < array.length; i++){
            if (array[i].contains("java")) {
                System.out.println(new StringBuilder(enteredMessage).reverse());
            }
            else {
                if (i % 2 == 0) {
                    System.out.println(array[i].toUpperCase());
                }
                else {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
