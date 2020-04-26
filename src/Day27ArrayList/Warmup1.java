package Day27ArrayList;

import java.util.Arrays;

public class Warmup1 {
    public static void main(String[] args) {
        double []c={2.6,7.4,4.2,5.1,1.2,3.9};
        System.out.println(Arrays.toString(Descending(c)));
        System.out.println(Arrays.toString(Descending(c)));

        char[] ch={'c','a','b','z'};
        System.out.println(Arrays.toString(Descendin(ch)));

        String [] str={"ana","ata","misi","qaqa","dimbil","hastpust"};
        System.out.println(Arrays.toString(Descending(str)));
    }

    public static int[] Descending(int[] a){
        Arrays.sort(a);
        int [] result=new int[a.length];
        int z=0;
        for (int i=a.length-1;i>=0;i--){
            result[z]=a[i];
            z++;
        }
        return result;
    }

    public static double[] Descending(double[] a){
        Arrays.sort(a);
        double [] result=new double[a.length];
        int z=0;
        for (int i=a.length-1;i>=0;i--){
            result[z]=a[i];
            z++;
        }
        return result;
    }

    public static char[] Descendin(char[] a){
        Arrays.sort(a);
        char [] result=new char[a.length];
        int z=0;
        for (int i=a.length-1;i>=0;i--){
            result[z]=a[i];
            z++;
        }
        return result;
    }

    public static String[] Descending(String [] a){
        Arrays.sort(a);
        String  [] result=new String[a.length];
        int z=0;
        for (int i=a.length-1;i>=0;i--){
            result[z]=a[i];
            z++;
        }
        return result;
    }




}
