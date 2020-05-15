package InteviewquestionsPractice;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistRemovevalues {

    /*
    ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
remove all values greater than 100.
     */
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        for (int i=0;i<list1.size();i++){
            list1.removeIf(p->p>100);
        }
        System.out.println(list1);



    }



}
