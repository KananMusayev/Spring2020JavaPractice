package ClassTasks;

public class task10 {


    public static void main(String[] args) {



        int a[]={1,8,5,4,0,3,5};
        int min=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);

    }
}
