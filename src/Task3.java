public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 7, 16, 2, 31, 44, 121, 2, 3, 5, 66};
        int biggestNumber = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }
        System.out.println(biggestNumber);
    }
}
