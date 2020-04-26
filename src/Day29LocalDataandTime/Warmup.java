package Day29LocalDataandTime;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
    int z[]={1,4,1,8,6,4,6,0,-4};
        System.out.println(minimumnum(z));
        double t[]={4.5,6.7,4.5,6.7,8.9,0.6};
        System.out.println(minimumnum(t));
        System.out.println();
        unique(z);
        System.out.println();
        unique(t);
    }
        public static int minimumnum(int []a) {
        Arrays.sort(a);
        int k=a[0];
        return k;
    }
        public static double minimumnum(double []a){
        Arrays.sort(a);
        double k=a[0];
        return k;
    }
        public static void unique(int[]a) {
        for (int k = 0; k < a.length; k++) {
            int count=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]==a[k]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(a[k]);
            }
        }
    }
        public static void unique(double[]a) {
        for (int k = 0; k < a.length; k++) {
            int count=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]==a[k]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(a[k]);
            }
        }}
        public static void minimum(int []a){
        int min=a[0];
        for (int each:a){
            if (each<min){
                min=each;
            }
        }
            System.out.println(min);

        }
}

