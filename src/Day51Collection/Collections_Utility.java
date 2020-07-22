package Day51Collection;

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {




        //write a program that can remove dups from arraylist


        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,5,4,3,4,3,2,5,6,8,7,3,6,9,7));

        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(nums);

        System.out.println(linkedHashSet);

        System.out.println("=============================");

        ArrayList<String > letters=new ArrayList<>();
        letters.addAll(Arrays.asList("A","A","B","C","B","D"));
        boolean result=Collections.frequency(letters,"A")==1;
        System.out.println(result);

        //write a program that can remove dups from arraylist and sort it in ascending
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4));

        System.out.println(list);
        Collections.sort(list);


        System.out.println("====================");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,5,4,3,4,3,2,5,6,8,7,3,6,9,7));
        TreeSet <Integer> treeSet=new TreeSet<>(list3);
        System.out.println(treeSet);






        /*write a program that can remove dups from arraylist and sort it in ascending

        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,5,4,3,4,3,2,5,6,8,7,3,6,9,7));

        List<Integer> list4=new ArrayList<>();

        for (int i=0;i<list2.size();i++){
            if (!list4.contains(list2.get(i))){
                list4.add(list2.get(i));
            }
        }
        Collections.sort(list4);

        System.out.println(list4);



         */

    }
}
