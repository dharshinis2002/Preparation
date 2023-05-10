public class IndexArray {
    public static void main(String[] args) {
        int[] array = {8, 3, 6, 2, 7, 9};
        int element=9;
        int index=-1;
        int i=0;
        while (i< array.length){
            if(array[i]==element) {
                index = i;
            }
        i++;
        }  System.out.println(index);



    }
}
