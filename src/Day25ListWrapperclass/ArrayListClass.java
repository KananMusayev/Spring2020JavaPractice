package Day25ListWrapperclass;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListClass {
    public static void main(String[] args) {
        //presented in "java.util" package
        //u have to import it in order to use it
        /*
        1.import java.util.ArrayList;
        2.ArrayList doestn support primitives
        3.Similar to Array in ArrayList we store Objects ONLY, all the values
        in ArrayList are objects(none primitives)
        Arraylist<class Type>variableName=new Arraylist<>();
        4.ArrayList's size is automatically adjusted(dynamic)
         */


        ArrayList<Integer>   list =new ArrayList<>();
        //or
        ArrayList<Integer>  list2 =new ArrayList<Integer>();

        System.out.println(list2);

        /*
        Method:
                add(value)
         */

                list2.add(10);//
                list2.add(20);
                list2.add(30);
        System.out.println(list2);


        /*
        get method :used to get the specific values from the arraylist
         */
        System.out.println(list2.get(1));
        /*
        size method: it will return u the length of the arraylist
         */
        System.out.println(list2.size());
        /*
        clear method : clears the arraylist . removes all the values from the array
         */
            list2.clear();
        System.out.println(list2);
        System.out.println(list2.size());

        /*
        to sort Arraylist u need to import a class: Collections.sort(Variable Name)

         */

        ArrayList<Integer> abc=new ArrayList<>();
        abc.add(7);
        abc.add(8);
        abc.add(9);
        abc.add(3);
        abc.add(2);
        Collections.sort(abc);
        System.out.println(abc);

        ArrayList<Integer> dtx=new ArrayList<>();
        for (int i=20;i>=0;i--){
            dtx.add(i);
        }
        System.out.println(dtx);
        Collections.sort(dtx);
        System.out.println(dtx);






    }

}
