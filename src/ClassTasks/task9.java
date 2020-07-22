package ClassTasks;

public class task9 {

    public static void main(String[] args) {
        /*
        Array -- Find Maximum
Write a method that can find the maximum number from an int Array
         */

        int []a={1,5,3,7,3,9};

        int max=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);







    }
}
