package InteviewquestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMovezerostotheend {
    public static void main(String[] args) {
        /*
        Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes
 of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
         */
        int[]array={1,0,2,0,3,0,4,0};

        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==0){
                count++;
            }
        }

        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
        }

        for (int i=0;i<list.size();i++){
            list.removeIf(p->p==0);
        }

        for (int i=0;i<count;i++){
            list.add(0);
        }

        int[]array2=new int[array.length];
        for (int i=0;i<list.size();i++){
            array2[i]=list.get(i);
        }

        System.out.println(Arrays.toString(array2));
    }
}
