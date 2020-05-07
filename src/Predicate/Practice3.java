package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Practice3 {
    public static void main(String[] args) {
/*
write a program that can extract the sepecial characters,
digits and alphebets from a string and stores them into seperate
ArrayLists of Character:
        DO NOT USE LOOPS
 */

String a=  "ABCD123$%#@&456EFG!";
char ch[]=a.toCharArray();
Character array2[]=new Character[ch.length];
for (int i=0;i<ch.length;i++){
    array2[i]=ch[i];
}

        ArrayList<Character >alphabet2=new ArrayList<>(Arrays.asList(array2));
        alphabet2.removeIf(p-> !Character.isAlphabetic(p));

        ArrayList<Character >digits2=new ArrayList<>(Arrays.asList(array2));
        digits2.removeIf(p->!Character.isDigit(p));
        ArrayList<Character >character2=new ArrayList<>(Arrays.asList(array2));
        character2.removeIf(p->Character.isDigit(p));
        character2.removeIf(p->Character.isAlphabetic(p));


        System.out.println(digits2);
        System.out.println(alphabet2);
        System.out.println(character2);



        /*
        write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}

                Without Lambda
         */



        String str="ABCD123$%#@&456EFG!";
        char array[]=str.toCharArray();

        ArrayList<Character >alphabet=new ArrayList<>();
        ArrayList<Character >digits=new ArrayList<>();
        ArrayList<Character >characters=new ArrayList<>();

        for (char each:array){
            if (Character.isAlphabetic(each)){
                alphabet.add(each);
            }
            else if (Character.isDigit(each)){
                digits.add(each);
            }
            else {
                characters.add(each);
            }
        }
        System.out.println(alphabet);
        System.out.println(digits);
        System.out.println(characters);
    }
}
