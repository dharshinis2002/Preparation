public class ArrayReverse {
    public static void main(String[] args) {
//        String[]names={"dharshini","shuruthi","vini","selvi"};
//
//        String reversed = "";
//        System.out.println("original text:" + Arrays.toString(names));
//        for (int i = names.length - 1; i >= 0; i--) {
//            reversed += i;
//            System.out.println(names[i]);
//
//        } }
////
//        String name = "anbu";
//        String reversed = "";
// for (int i=name.length()-1;i>=0.;i--) {
//     reversed += name.charAt(i);
// } System.out.println(reversed);
//
//    }

        int number = 987654, reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}