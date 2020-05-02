package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {


        /*
        Collections.frequency:
         Collections.frequency(Collection Type,Object) returns the frequency
        of the given object from the given collectionType
         */

        //Ex:
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int count= Collections.frequency(list,0);
        System.out.println(count);
        /*
        max method: going to return u the maximum object(Integer) from the list
         */

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max=Collections.max(list2);
        System.out.println(max);

        /*
        min method:going to return u the minimum object(Integer) from the list

         */

        int min=Collections.min(list2);
        System.out.println(min);

        /*
        swap(CollectionType,index1,index2)
        {1,2,3,4,5}
        now swap 1,2
         */
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(list3,0,1);
        System.out.println(list3);

        /*
        replaceAll(CollectionType,oldvalue,newvalue)
         */

        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(1,1,3,4,6,1,3,1));
        //replace all the 1 's with 10;
        Collections.replaceAll(list4,1,10);
        System.out.println(list4);







    }
}
