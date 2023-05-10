public class DublicateElement {
    public static void main(String[] args) {
        int []num={7,4,2,7,0,7,5,4};
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }
    }
}


        


