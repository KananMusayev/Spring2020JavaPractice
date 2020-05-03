package CodingBat;

import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        int max=0;
        int A[]=new int[3];
        int a=2;  int b=3;   int c=1;
        A[0]=a;
        A[1]=b;
        A[2]=c;
        Arrays.sort(A);
        max=A[2];
        System.out.println(max);

    }

    public boolean in3050(int a, int b) {
       boolean cavab=false;
       if (a>=30||a<=50&&b>=30||b<=50){
           cavab=true;
       }
       return cavab;



    }

}




