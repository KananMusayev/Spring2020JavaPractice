package Rephlits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwithElements {
    public static void main(String[] args) {
    int [] t={1,7,3,4};


    do_switch(t);

    }

    public static int[] do_switch(int[] i){

        //do_switch([1,7,3,4])
        //returns:[[4,7,3,1]
        ArrayList<Integer> list=new ArrayList<>();
        for (int z=0;z<i.length;z++){
            list.add(i[z]);
        }

        Collections.swap(list,0,list.size()-1);

        for (int k=0;k<list.size();k++){
            i[k]=list.get(k);
        }
        return i;

    }
}
