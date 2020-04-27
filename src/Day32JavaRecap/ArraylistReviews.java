package Day32JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraylistReviews {
    public static void main(String[] args) {
        ArrayList<String>a = new ArrayList<>();
        a.addAll(Arrays.asList("kenan","ahmet","hatice"));
        Collections.sort(a);
        System.out.println(a);
    }




}
