package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class EveningWarmup3 {
    public static void main(String[] args) {
        /*
        3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names
			that have length of 10 or greater
         */

        ArrayList<String >names=new ArrayList<>(Arrays.asList("Usa","Azerbaijan","Brazil","France","Uzbekistan","Turkmenistan","Tacikistan"));

        names.removeIf(p->p.length()>=10);
        System.out.println(names);
    }
}
