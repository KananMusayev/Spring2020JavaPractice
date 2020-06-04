package Whatever;

import java.util.ArrayList;
import java.util.Arrays;

public class abc {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,2,4,3,5,6,7,5));
        ArrayList<Integer> result=new ArrayList<>();
        for (int k=0;k<list.size();k++){
            int count=0;
            for (int i=0;i<list.size();i++){
                if (list.get(i)==list.get(k)){
                    count++;
                }
            }
            if (count>1){
                result.add(list.get(k));
            }

        }
        System.out.println(result);




    }

}