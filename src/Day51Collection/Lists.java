package Day51Collection;

import Resources.Sta;

import java.util.*;

public class Lists {


    public static void main(String[] args) {
      //  List<Integer> list1 = new List<Integer>(); you can not create object from interface


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);


        System.out.println("================");

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);



        Vector<Integer> vector=new Vector<>();
        vector.add(10);

        Stack<Integer> stack=new Stack<>();
        stack.add(10);

        System.out.println("===================");

        Stack<String >names=new Stack<>();
            names.add("Alisa");
            names.add("Kenan");
            names.add("Esmira");
            names.add("Alis");
            names.add("Mishi");
        System.out.println(names);
        String s1=names.pop();
        System.out.println(s1);
        System.out.println(names);

        String s2= names.pop();
        System.out.println(names);
        System.out.println(s2);

        names.push("Mishi");//same thing with add method
        System.out.println(names);







    }




}
