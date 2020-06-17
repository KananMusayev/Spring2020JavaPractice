package Whatever;

public class fjf {


    public static void main(String[] args) {
        //9. Find the second largest element in an array.

        int a[]={4,6,8,90,4,46,3,5,8,1};

        int b=Integer.MIN_VALUE;
        int result=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>b){
                b=a[i];
            }
        }
        System.out.println(b);
        int c=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]>c&&a[i]<b){
                c=a[i];
            }
        }
        System.out.println(c);
    }
}
