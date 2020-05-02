package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Eveningwarmup2 {
    public static void main(String[] args) {
/*
write a program that can return the duplicated objects
from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
 */
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        nums.removeIf(p->Collections.frequency(nums,p)==1);
        System.out.println(nums);
    }

}
