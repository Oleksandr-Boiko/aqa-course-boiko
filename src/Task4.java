import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 7, 16, 2, 31, 44, 121, 2, 3, 5, 66};
        for(int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(array));
        }
}
