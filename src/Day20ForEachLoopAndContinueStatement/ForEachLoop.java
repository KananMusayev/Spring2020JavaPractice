package Day20ForEachLoopAndContinueStatement;

import Day18Array.Array;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop also called enhance loop

        //used to acces the value in a collection of values
        //for each loop is already been iterated
        //for each loop Never goes infinite . Can never be infinite loop

        //for each loop dont have index number
        //sytax of for each loop
        //for(DataType Variable name:VariableNameofCollection){    }
        //for(DataType each :ArrayName){    }
        int [] arr ={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=====================");
        for (int each : arr){
            System.out.println(each);
        }
        System.out.println();
        String[] str1={"A","B","C","D","E"};
        for (String each:str1){
            System.out.print(each);
        }
        System.out.println();

        //when u dnt need the index of variables then u can use for each loop
        //u cant get acces to the index numbers


        char[]ch={'z','x','y','c','a','b'};
        //need to sort the array in ascending order
        // and print out each value one by one on the consule
        Arrays.sort(ch);

        for (char each:ch){
            System.out.print(each); }
        System.out.println();

        int [] arr1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        //print out only the even numbers from the array with for each loop
        for (int each:arr1){
            if (each%2==0){
            System.out.print(each+" ");}
        }

        //print out 1~1000 -->we cant use for each loop












    }
}
