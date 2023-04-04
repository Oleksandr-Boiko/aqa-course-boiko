import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        int average = sum / array.length;
        System.out.println(average);

    }
}
