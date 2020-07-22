package ClassTasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {

/*
String -- Sort Letters and Numbers from alphanumeric String
 */


String a="DC501GCCCA098911";

String result="";
        ArrayList<String>alphabet=new ArrayList<>();
        ArrayList<String>numbers=new ArrayList<>();
        ArrayList<String>total=new ArrayList<>();

        for (int i=0;i<a.length();i++){
    if (Character.isAlphabetic(a.charAt(i))){
        alphabet.add(a.substring(i,i+1));
        if (i+1>=a.length()){
            Collections.sort(alphabet);
            total.addAll(alphabet);
            break;
        }
        if (Character.isDigit(a.charAt(i+1))){
            Collections.sort(alphabet);
            total.addAll(alphabet);
        }
    }
    else if (Character.isDigit(a.charAt(i))){
        numbers.add(a.substring(i,i+1));
        if (i+1>=a.length()){
            Collections.sort(numbers);
            total.addAll(numbers);
        }
        if (Character.isAlphabetic(a.charAt(i+1))){
            Collections.sort(numbers);
            total.addAll(numbers);
            break;
        }
    }

}


        System.out.println(total);

    }
}
