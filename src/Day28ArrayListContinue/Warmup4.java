package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup4 {
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

        ArrayList<String> list2 = new ArrayList<>();
        for (int z=0;z<list.size();z++){
            int count=0;
            for (int i=0;i<list.size();i++) {
            if (list.get(i)==list.get(z)){
                count++;
            }
        }
        if (count!=1){
            if (list2.contains(list.get(z))){
                continue;
            }
            list2.add(list.get(z));

        }
        }
        System.out.println(list2);


    }

}
