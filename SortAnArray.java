import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int temp = 0;
        int[] array = {2, 3, 1, 5, 9, 4};
        System.out.println("original"+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; i < array.length; i++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("sort array"+array[i]);
        }
    }
}