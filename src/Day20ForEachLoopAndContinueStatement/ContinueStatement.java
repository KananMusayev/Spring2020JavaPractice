package Day20ForEachLoopAndContinueStatement;

public class ContinueStatement {
    public static void main(String[] args) {
        /*
        continue statement : its used for skipping the
        current iteration of the loop and jumps to the next iteration
         */

        for (int i=0;i<5;i++){
            if (i==2){
                continue;
            }
            System.out.println(i+" "); }

        System.out.println();
        int [] numbers={1,2,3,4,5};
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<3){
                continue;
            }
            System.out.print(numbers[i]+" ");

        }

    }
}
