package Day15ForLoopTasks;

public class task2 {
    public static void main(String[] args) {
        /*
        Print out the sum of all odd nums between 1-1000
         */

        int sum = 0;
        for (int i=1;i<=100;i++)
            if (i%2!=0){
                sum+=i;
            }
        System.out.println(sum);


    }
}
