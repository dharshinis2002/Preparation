import java.util.Arrays;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.println("enter any number");
//        int num=in.nextInt();
//        boolean isPrime;
//        for(int  i=2;i<num/2;i++){
//            if(i%num==0) {
//                isPrime = false;
//                break;
//            }  } if (isPrime=true){
//                    System.out.println("it is prime number");
//                }else {
//                    System.out.println("not prime");
//                }
//            }
//        }
//
//
//        int temp = 0;
//   Scanner in=new Scanner(System.in);
//   System.out.println("enter any num");
//       int a=in.nextInt();
//       boolean isPrime;
//     for (int i=1;i<=a/2;i++){
//    if (i%a==0) {
//        isPrime = false;
//    }
//    }
//    if (isPrime=true){
//        System.out.println("it is prime number");
//    }else {
//        System.out.println("not prime num");
//    }
//}
//    }
//
//
//
//
//
//
//
        int count;
        System.out.println("1 to 100 prime numbers");
        for (int i=1;i<=100;i++){
            count=0;
        for (int j=1;j<=100;j++) {
            if (i%j==0){
                count++;
            }
         }
            if (count==2){
                System.out.println(i);
            }
        }}
}
