package Day24Method_Overloading;

import java.util.Arrays;

public class MethodOverloadexample2 {
    public static void main(String[] args) {
        //Arrays.sort();
        //when u uncommand u can see how many overloaded methods to they have
        //if they ask what it is as an example u can just tell write Arrays.sort
        // and it will show how many methods are in same name there with different data type
        int []arr={1,2,3,4,5};
        sort(arr);
        char[] chars={'a','b','c'};
       // sort(chars); u cant use it because you provided int []arr to be taken
        //after u creat another method u can overload now
        System.out.println();
        sort(chars);
        String [] str ={"A","B","C","D"};//{D,C,B,A}
        System.out.println();
        sort(str);

    }

    public static void sort(int[]arr){
                            //[1,2,3,4,5]
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(char[]arr){
        //[1,2,3,4,5]
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(String []arr){
        //[1,2,3,4,5]
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+" ");
        }
    }



}
