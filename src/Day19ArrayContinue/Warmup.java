package Day19ArrayContinue;

public class Warmup {
    public static void main(String[] args) {
        /*
        Write a program that can print out the unique
        values from an int array
        Ex:  if arr ={1,1,2,3,3}
            output :2
            or
            if arr ={1,2,2,3,4,4}
            output :1,3
         */
        int[]a={1,1,2,3,3};

        for (int k = 0;k<a.length;k++) {
            int count=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == a[k]) {
                    count++;
                }}
            if (count == 1) {
                System.out.println(a[k]); }


        }
}}
