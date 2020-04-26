package Day18Array;

public class ArrayTask2Warmup {
    public static void main(String[] args) {
         /*
        Write a program that can return the minimum value
        from an int array and then find the second minimum num
         */

         int min =999999999;
         int[] abc ={10,20,12,7,54,64,3,4};
         for (int i =0;i<abc.length;i++){
             if (abc[i]<min){
                 min=abc[i];
             } }
        System.out.println(min);
         int min2=999999999;
         for (int a =0;a<abc.length;a++){
             if (abc[a]<min2&&abc[a]>min){
                 min2=abc[a];
             }
         }
        System.out.println(min2);
    }
}
