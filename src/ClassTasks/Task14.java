package ClassTasks;

import java.util.Arrays;

public class Task14 {
    public static int[] Solution(int N){

        int[] result = new int[N];

        int sum = 0;

        for(int i=0; i < N-1; i++) {

            result[i] =i;

            sum += i;

        }

        result[N-1] = -sum;

        return result;

    }
    public static void main(String[] args) {


        System.out.println((Arrays.toString(Solution(9))) );

        int n=9;
        int []a=new int[n];
        int sum=0;
        for (int i=0;i<a.length;i++){

            if (i+1==a.length){
               a[i]=sum-(2*sum);
               break;
            }
            a[i]=i;
            sum+=i;
        }
        System.out.println(Arrays.toString(a));


    }
}
