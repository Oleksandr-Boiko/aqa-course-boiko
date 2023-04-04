import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();
        int biggerDivisor = 1;
        for (int i = 1; i < enteredValue; i++){
            if(enteredValue % i == 0 ){
                int divisor = i;
                if (divisor > biggerDivisor) {
                    biggerDivisor = divisor;
                }
            }
        }
        System.out.println(biggerDivisor);
    }
}
