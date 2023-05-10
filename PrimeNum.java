import java.util.Arrays;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
//        int count;
//        System.out.println("prime numbers");
//
//        for (int i = 1; i <= 100; i++) {
//            count = 0;
//
//            for (int j = 1; j <= 100; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }if (count == 2) {
//                        System.out.println(i);
//
//                }
//        }
//    }
//}
//
  int count;
        System.out.println("0 to 100 prime numbers");
        for (int i=1;i<=100;i++){
            count=0;
        for (int j=1;j<=100;j++) {
            if (i%j==0) {
                count++;

            }
        }if (count==2){
                    System.out.println(i);
                }
            }
        }


    }
