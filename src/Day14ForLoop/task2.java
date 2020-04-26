package Day14ForLoop;

public class task2 {
    public static void main(String[] args) {

        /*

        write a program that displays each odd numbers between 1-32
         */

        for (int i = 1;i<32;i+=1){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
}
