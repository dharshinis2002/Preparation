import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
      String[]array={"DHARSHI","MABI","KANI","VINI","SHRUTHI"};
        System.out.println("original array :"+Arrays.toString(array));

        Collections.shuffle(Arrays.asList(array));
        System.out.println("shuffled array :"+Arrays.toString(array));
    }}