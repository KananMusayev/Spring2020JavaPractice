package CodingBat;

import Day01FirsJavaProgramming.Task;
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


        /*
        Write a method that can move all the zeros to  last indexes
         of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
         */


        int array[]={1,0,2,0,3,0,4,0};
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i<array.length;i++){
            list.add(array[i]);

            if (array[i]==0){
                count++;
            }
        }
        list.removeIf(p->p==0);
        for (int i =0;i<count;i++){
            list.add(0);
        }
        int array1[]=new int[list.size()];

        for (int i=0;i<list.size();i++){
            array1[i]=list.get(i);
        }

        System.out.println(Arrays.toString(array1));

    }









    }





