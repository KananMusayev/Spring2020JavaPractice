package Day31ConstructorsContinue;

import java.util.ArrayList;

public class Warmup4 {
    public static void main(String[] args) {
/*
Write a return method that accepts the Integer array and returns the minium
DONT USE SORT METHOD
 */
Integer[]a={1,4,7,9,8,0};
        System.out.println(minimum(a));
    }

    public static int minimum(Integer a[]){
       Integer c= Integer.MAX_VALUE;

       for (int i=0;i<a.length;i++){
           if (a[i]<c){
               c=a[i];
           }
       }
       return c;



    }
}
