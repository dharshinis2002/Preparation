import java.util.ArrayList;

public class LamdaDemo {
public static void main (String[]args){
    ArrayList<String>namesList=new ArrayList<>();
    namesList.add("dharshini");
    namesList.add("mabi");
    namesList.add("madhu");
//    System.out.println(namesList);

    //namesList.forEach((names)-> System.out.println(names));

for (int i=0;i<namesList.size();i++){
    System.out.println(namesList.get(i));
}

}}
