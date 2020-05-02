package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Collections;

public class EveningWarmup4 {
    public static void main(String[] args) {
        /*
         write a program that can extract the sepecial
         characters, digits and alphebets from a string
         and stores them into seperate ArrayLists of Character:
			ex:
			    str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
         */







        String str ="ABCD123$%#@&456EFG!";
        ArrayList<Character > list=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            list.add(str.charAt(i)); }
        ArrayList<Character > Chars=new ArrayList<>();
        ArrayList<Character  > Alphabet=new ArrayList<>();
        ArrayList<Character > Nums=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (Character.isDigit(list.get(i))){
                Nums.add(list.get(i)); }
            else if (Character.isAlphabetic(list.get(i))){
                Alphabet.add(list.get(i)); }
            else { Chars.add(list.get(i)); } }
        System.out.println(Chars);
        System.out.println(Alphabet);
        System.out.println(Nums);

    }
}
