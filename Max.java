public class Max {
    public static void main( String[] args){
        int[] array={6,9,2,9,7};
           int max=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
                if(array[i]>max){
                System.out.println(array[i]);
                max=array[i];

            }
        }
    }
}
