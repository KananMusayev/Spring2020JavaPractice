package ClassTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextweekQuestion {
    public static void main(String[] args) {


        /*
        Array -- Concat two arrays
Write a return method that can concate two arrays
         */



        int k[]= {1,3,5,7,9,11,13,15};
        int z[]= {2, 4, 6, 8, 10, 12, 14, 16};
        int r[]=new int[k.length+z.length];
        int f=0;
        int w=1;
        for (int i=0;i<k.length;i++){
            r[f]=k[i];
            r[w]=z[i];
            w+=2;
            f+=2;
        }
        System.out.println(Arrays.toString(r));

    }

}