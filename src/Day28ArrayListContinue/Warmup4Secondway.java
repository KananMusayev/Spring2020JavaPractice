package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warmup4Secondway {
    public static void main(String[] args) {
        /*
        write a program that can return the duplicated values
        from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "D"));
        ArrayList<String> result = new ArrayList<>();


        for (String each:list){
            int count = Collections.frequency(list,each);
            if (count>1&&!result.contains(each)){
                result.add(each);
            }}
        System.out.println(result);



    }
}
