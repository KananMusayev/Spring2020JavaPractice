package Day52Iterable_Maps;

import java.util.*;

public class Iterating_Collections2 {


    public static void main(String[] args) {

        LinkedHashSet<String > names=new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        Iterator<String > it=names.iterator();

        while (it.hasNext()){
            String  s=it.next();
            if (s.toLowerCase().contains("m")){
                it.remove();
            }
        }
        System.out.println(names);


        System.out.println("========================================");


        LinkedHashSet<String > students=new LinkedHashSet<>();
        students.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        for (Iterator<String > A=students.iterator();A.hasNext();){
                 String name=A.next();
                 if (name.toLowerCase().contains("m")){
                     A.remove();
                 }
        }
        System.out.println(students);

        System.out.println("========================================");


        LinkedHashSet<String > List=new LinkedHashSet<>();
        List.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));


        List.removeIf(p->p.toLowerCase().contains("m"));
        System.out.println(List);

        System.out.println("========================================");


        LinkedHashSet<String > List2=new LinkedHashSet<>();
        List2.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        List2.removeAll(Arrays.asList("Ozgur","Mehmet","Mohammed"));

        System.out.println(List2);

        System.out.println("========================================");


        LinkedHashSet<String > list=new LinkedHashSet<>();
        list.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        //yucel.sha ahmet

        list.retainAll(Arrays.asList("Yucel","Sha","Ahmet"));
        System.out.println(list);

        System.out.println("========================================");


           List<Integer> list1=new ArrayList<>();
           list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

           //Verify 5-,6,9,8 are contained in the list
        System.out.println(list1.containsAll(Arrays.asList(5,6,8,9)));



    }
}
