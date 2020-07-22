package ClassTasks;

public class ArrayfindMin {

    public static void main(String[] args) {

       /*
       find the min number from int Array
        */
       int a[]={3,6,8,9,0,5,2};
       int min=a[0];
       int Min=Integer.MAX_VALUE;
       for (int i=0;i<a.length;i++){
           if (a[i]<min||a[i]<Min){
               min=a[i];
               Min=a[i];
           }
       }
        System.out.println(Min);
        System.out.println(min);



    }
}
