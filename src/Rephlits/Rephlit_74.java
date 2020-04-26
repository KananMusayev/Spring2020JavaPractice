package Rephlits;

public class Rephlit_74 {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a));
    }

    public static double avgElements(int[] array){
        double sum=0;
        double average=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        average=sum/array.length;
        return average;
    }

}
