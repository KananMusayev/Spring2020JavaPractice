package CodingBat;

import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int count =3;
        String word="Word";
        String sep="X";
        String a=word;

        String result="";
        for (int i=1;i<count;i++){
            word+=""+sep+a;
        }
        System.out.println(word);

        }



    public String repeatSeparator(String word, String sep, int count) {
//repeatSeparator("This", "And", 2) → "ThisAndThis"

        String result="";
        String a=word;
        for (int i=1;i<count;i++){
            word+=sep+a;
        }
        if (count==0){
            word="";
        }
        return word;







        }






}
