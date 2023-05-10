import java.util.*;

public class Purchase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[]products={"baseball","soccer","volleyball","football","basketball"};
        double[]cost       ={1.00,5.00,6.00,9.00,12.0};
        int[] quantities=new int[5];

        System.out.println("enter the amount you paid");
        int amountpaid=input.nextInt();

        for(int i=0;i<products.length;i++){
            System.out.println("enter the quantities for %s"+products[i]);
            quantities[i]=input.nextInt();

        }
        int totalCost=0;
        for(int i=0;i<products.length;i++){
            totalCost+=cost[i]*quantities[i];
        }
        System.out.println("purchase details:");
        System.out.println("total purchase amount:"+totalCost);
        int balance=amountpaid-totalCost;
        System.out.println("balance:"+balance);
    }
}






