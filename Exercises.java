import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        ArrayList<String >name=new ArrayList<>();
        name.add("bhdhb");
        String[]names=name.toArray(new String[name.size()]);
        for(String i:names){
            System.out.println(i);
        }
        }
    }