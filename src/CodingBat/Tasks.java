package CodingBat;

import Day18Array.Array;
import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class Tasks {

    public static void main(String[] args) {
        int n=2;

        String str="xyzxyxyxy";
        String a=str.substring(n,n+1);
        System.out.println(a);
    }



    public int[] fizzArray3(int start, int end) {

        //fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
        int Array[]=new int[end-start];

        for (int i=0;i<end-start;i++){
            Array[i]=start;
            start++;
        }


        return Array;


    }



    }





