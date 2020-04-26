package Day31ConstructorsContinue;

public class Warmup2 {
    public static void main(String[] args) {
/*
write a return method that accepts an Integer array
 and returns the maximum number
 DONT USE SORT METHOD
 */
Integer a[]={1,4,6,8,9,3,6};
        System.out.println(max(a));
    }
    public static Integer max(Integer []a){

        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }




}
