import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String enteredMessage = scanner.nextLine();
        System.out.println("Enter your symbol: ");
        String enteredSymbol = scanner.next();
        int counter = 0;
        for (int i = 0; i < enteredMessage.length(); i++){
            if (enteredMessage.charAt(i) !=' ') {
                counter++;
            }
        }
        System.out.println(counter + enteredSymbol.length());
    }
}
