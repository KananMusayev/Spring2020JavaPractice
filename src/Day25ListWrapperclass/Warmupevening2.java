package Day25ListWrapperclass;

import java.util.ArrayList;

public class Warmupevening2 {
    public static void main(String[] args) {



    /*
    write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
     */
        int a[] = {1, 1, 2, 3, 3, 4, 5};

        ArrayList<Integer> b = new ArrayList<>();
        for (int k = 0; k < a.length; k++) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]==a[k]){
                    count++;
                }
            }
            if (count==1){
                b.add(a[k]);
            }
        }
        System.out.println(b);
    }
}
