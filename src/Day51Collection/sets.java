package Day51Collection;
import java.util.*;

public class sets {


    public static void main(String[] args) {

     Set<String> names = new LinkedHashSet<>();

     names.add("Sha");
     names.add("Zuura");
     names.add("Saban");
     names.add("Ozgur");
     names.add("Ozgur");
     names.add("Ozgur");
     names.add("Ozgur");
     System.out.println(names);


     String []arr={"A","A","C","B","A"};

     //OPTION 1
        Set<String >list=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(list);

        //System.out.println(list.get(1));Set doesnt have index number

       //OPTION 2
       ArrayList<String>list2=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list2.add(arr[i]);
        }

     for (int i=0;i<list2.size();i++){
         int count=0;
         for (int k=0;k<list2.size();k++){
             if (list2.get(k)==list2.get(i)){
                 count++;
             }
         }
         if (count>1){
             list2.remove(list2.get(i));
         }
     }
        System.out.println(list2);


        System.out.println("=================");


        Set<Integer>numbers=new TreeSet<>(Arrays.asList(10,9,10,8,7,8,7,6,5,6));
        System.out.println(numbers);


        System.out.println("=========================");
        HashSet<String > hashSet =new HashSet<>();

        hashSet.add(null);

        System.out.println(hashSet);

        System.out.println("=========================A");

        TreeSet<String > treeSet =new TreeSet<>();
                   // treeSet.add(null);Will give u null pointer exception
        System.out.println(treeSet);


        System.out.println("=========================");

        String number = null;

        //int a=Integer.parseInt(number);
        //System.out.println(a); will give u Numberformat Exception


        String array[]={null,"Cybertek",null};
       // System.out.println(array[2].toUpperCase()); since it's value is null u can not use the reference of it as methods

        String name1="Cybertek";
        name1=null;

        //name1=name1.toUpperCase();Will give null pointer exception since it is not referenced to anything
        //System.out.println(name1);













    }
}
