
import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter any num");
//        int  n=input.nextInt();
//        int fact=1;
//       for (int i=1;i<=n;i++){
//             fact*=i;
//        }
//        System.out.println(fact);
//    }
//}




















public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("enter any num");
        int num= in.nextInt();
        for (int i=1;i<=num;i++) {
            fact *= i;

        }System.out.println(fact);


}}