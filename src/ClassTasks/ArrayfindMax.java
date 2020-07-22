package ClassTasks;

public class ArrayfindMax {

    public static void main(String[] args) {
        /*
        Array -- Find Maximum
Write a method that can find the maximum number from an int Array
         */

    int a[]={1,4,5,7,7,8};
    int max=a[0];
    for (int i =0;i<a.length;i++){
        if (a[i]>max){
            max=a[i];
        }
    }
        System.out.println(max);

    int Max=Integer.MIN_VALUE;

    for (int i=0;i<a.length;i++){
        if (a[i]>Max){
            Max=a[i];
        }
    }
        System.out.println(Max);


    }
}
