import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int firstArrayLength = array1.length;
        int secondArrayLength = array2.length;
        int[] mergedArray = new int[firstArrayLength + secondArrayLength];
        System.arraycopy(array1, 0, mergedArray, 0, firstArrayLength);
        System.arraycopy(array2, 0, mergedArray, firstArrayLength, secondArrayLength);
        System.out.println(Arrays.toString(mergedArray));
        int sum = 0;
        for (int i = 0; i < mergedArray.length; i++){
            sum+= mergedArray[i];
        }
        System.out.println(sum);
    }
}
