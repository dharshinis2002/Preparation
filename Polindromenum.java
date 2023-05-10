import java.util.Scanner;

public class Polindromenum {
    public static void main(String[] args) {
        int temp=0;

        Scanner input= new Scanner(System.in);
        System.out.println("enter any num to check");

        int a= input.nextInt();
        int original=a;
       int check =0;

      while (a<0) {
          temp = a % 10;
          check = (check * 10) + 10;
          a = a / 10;
      } if (original==check){
             System.out.println("1");
      }else {
             System.out.println("0");
         }
            }

    }
