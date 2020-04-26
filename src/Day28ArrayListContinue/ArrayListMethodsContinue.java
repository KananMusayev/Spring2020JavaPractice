package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethodsContinue {
    public static void main(String[] args) {
        /*
        remaining Methods:
        indexOf(),LastIndexOf(),

        converting array to ArrayList  : Arrays.asList(Object Array)

        removeAll(),addAll()
         */


        //IndexOf method:
        //returns the first index number of the given object from the arraylist
        //if it returns negative num it means the given object doesnt exist in the arraylist

        ArrayList<Integer> list =new ArrayList<>();
           list.add(1);
           list.add(Integer.valueOf("33"));
           list.add(Integer.parseInt("100"));
           list.add(200);
           list.add(20);
           list.add(1);


           int a=list.indexOf(1);
           int b=list.indexOf(12);//gonna give u -1 because there is not index12 yet.
           int c=list.indexOf(200);
        System.out.println(c);

        //Lastindexof
        //returns the last occured objects index number
        int A=list.lastIndexOf(1);//gonna return u the last 1's index number
        System.out.println(A);
        int C=list.indexOf(1);//this is gonna give u first 1's index number
        System.out.println(C);

    //Arrays.AsList:Used to convert object arrays to listinterface
        Integer[] arr={1,2,3,4,5};
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
        list1.add(100);//adds after the last index of array

        String [] arr2={"Java","Python","C#","C++"};
        ArrayList<String> abc=new ArrayList<>(Arrays.asList(arr2));
        System.out.println(abc);

        //int z[]={1,2,3,4,5};
        //ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(z));
        //not going to compile bcs the array we gave was a primitive in but had to be Integer (Wrapper class)


        //isEmpty: checks if the arraylist is empty and returns the boolean

        boolean r=abc.isEmpty();
        System.out.println(r);

        //addAll(Interface):used for storing multiple objects to ArrayList
        String []allnames={"Hashtpush","gulendam","fatma","aishe"};
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Kenan","Alisa","Esmira"));
        System.out.println(names);
        names.addAll(Arrays.asList(allnames));
        System.out.println(names);


        //removeAll:
        //removes all the matching objects
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,4,3,4,4));
        numbers.removeAll(Arrays.asList(1));//removes all the ones
        //u can also write numbers.removeAll(Arrays.asList(1,2)) and will remove both 1 and 2
        System.out.println(numbers);

        //remove()  method not designed to be with in the loop
        ArrayList<Integer> lis=new ArrayList<>();
        lis.addAll(Arrays.asList(1,1,1,1,2,3,4,6,7));
        for (int i =0;i<lis.size();i++){
            if (lis.get(i) ==1){
                lis.remove(i); } }
        System.out.println(lis);//[1, 1, 2, 3, 4, 6, 7] thats why dont use it with in the loop

        //Sorting the arraylist

        //sorting array == Arrays.sort;
        //sorting arrayList==Collections.sort(VariableName)
        //Arrays class is presented in  "java.util" package
        //Collections class is presented in "java.util" package
        Integer[]array={1,5,8,0,9,7,3};
        ArrayList<Integer> price=new ArrayList<>();
        price.addAll(Arrays.asList(array));
        Collections.sort(price);
        System.out.println(price);

    }
}
