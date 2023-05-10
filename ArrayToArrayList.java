import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[]array={"dharshi","mabi","bjcus"};
        ArrayList<String>name=new ArrayList<>(Arrays.asList(array));
        System.out.println(name);
    }
}

//arraylist to array
//        ArrayList<String> names = new ArrayList<>();
//        names.add("husch");
//        names.add("hgh");
//        String[] name =   names.toArray(new String[names.size()]);
//for (String array:name){
//    System.out.println(array);
//}
//    }
//}





















