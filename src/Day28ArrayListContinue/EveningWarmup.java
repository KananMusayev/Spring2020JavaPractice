package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class EveningWarmup {
    public static void main(String[] args) {
        /*
        1. write a program that can return the unique objects
         from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
         */

        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        nums.removeIf(p->Collections.frequency(nums,p)>1);
        System.out.println(nums);




    }
}
