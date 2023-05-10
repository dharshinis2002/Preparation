import java.util.Scanner;

//import java.util.Scanner;
//
//public class CheckVowel {
//    public static void main(String[]args){
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter any char");
//        char c=input.next().charAt(0);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//                System.out.println("it is vowel char");
//            }else{
//                System.out.println("it is consonant char");
//            }
//        }
//
//
//
//    }
public class CheckVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any letter");
        int l=in.next().charAt(0);
        if (l=='a'||l=='e'||l=='i'||l=='o'||l=='u'){
            System.out.println("it is vowel letter");
        }else {
            System.out.println("not vowel");
        }
    }
}