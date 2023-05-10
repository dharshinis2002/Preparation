import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        String name = "dharshini";
        String reverse="";
        System.out.println("original");
        for (int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);

        }
        System.out.println("reverse String");
        System.out.println(reverse);

    }
}

