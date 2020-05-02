package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {

        Predicate<Integer> oddnumber=x ->x%2!=0;

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddnumber);
        System.out.println(list);

        System.out.println("==============================");

        /*
        remove all nums tht are less than 5
         */

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Predicate<Integer> lessthan5=x-> x<5;
        list1.removeIf(lessthan5);
        System.out.println(list1);

        System.out.println("==============================");

        ArrayList<String > list3=new ArrayList<>(Arrays.asList("alisa","kenan","esmira","senan","mishi"));

        Predicate<String > StartswM=x->x.toLowerCase().startsWith("m");
        list3.removeIf(StartswM);
        System.out.println(list3);
        System.out.println("==============================");
        ArrayList<String > list4=new ArrayList<>(Arrays.asList("alisa","kenan","esmira","senan","mishi"));

        Predicate<String >startswmoa=each->each.startsWith("m")||each.startsWith("a");
        list4.removeIf(startswmoa);
        System.out.println(list4);

        System.out.println("==============================");
        ArrayList<Character > list5=new ArrayList<>(Arrays.asList('A','B','3','4','5','@','&','z'));
        //remove all the digits from the list


        Predicate<Character> removedigits=x->Character.isDigit(x);
        list5.removeIf(removedigits);
        System.out.println(list5);

        System.out.println("==============================");
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.removeIf(p->p>5);
        System.out.println(nums);
        System.out.println("==============================");
        ArrayList<Integer> nums1=new ArrayList<>(Arrays.asList(5,2,3,4,30,6,7,8,9,15,45));

        //remove all the numbers that are divisible by 3 or 5;

        nums1.removeIf(p->p%3==0||p%5==0);
        System.out.println(nums1);
        System.out.println("==============================");
        ArrayList<Character> nums2=new ArrayList<>(Arrays.asList('3','^','&','(','5','4','{','@','#'));














    }
}
