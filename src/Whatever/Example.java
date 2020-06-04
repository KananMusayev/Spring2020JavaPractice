package Whatever;

import Day25ListWrapperclass.ArraylistVSArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {


    /*
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int a[] = {1, 8, 3, 4, 5, 6};
        Arrays.sort(a);
        System.out.println(a[a.length - 1]);

        /*
        Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of
the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]


         */
        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count++;
            }
        }
        list.removeIf(p -> p == 0);
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
                if (input[i]!=list.get(i)){
                    input[i]=list.get(i);
                }
        }
        System.out.println(Arrays.toString(input));
    }
}
