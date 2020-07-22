package SpecialTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestion {

    public static void main(String[] args) {
        int []a={1,2,6,7,8,5,15,6,4,1};
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList());
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList());
        for (int i=0;i<a.length;i++){
            list.add(a[i]);
            list2.add(a[i]);
        }
        Collections.sort(list2);
        int b=list2.get(list2.size()-1);
        ArrayList<Integer> list3=new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            if (list2.get(i) == b) {
                break; }
            list3.add(list.get(i)); }
        Collections.sort(list3);
        int k=(list3.get(list3.size()-1))-list3.get(0);
        System.out.println(k);
    }
}
