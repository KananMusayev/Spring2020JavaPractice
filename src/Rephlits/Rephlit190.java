package Rephlits;

import java.util.ArrayList;

public class Rephlit190 {
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(-6);
        a.add(3);
        a.add(-8);
        a.add(0);
        a.add(4);
        a.add(3);
        System.out.println(appendPosSum(a));


        //(4,-6,3,-8,0,4,3)
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> a){

        ArrayList<Integer> result=new ArrayList<>();

        for (int i=0;i<a.size();i++){
            if (a.get(i)>0){
                result.add(a.get(i));
            }
        }
        int sum=0;
        for (int i=0;i<result.size();i++){
            sum+=result.get(i);
        }

        result.add(sum);
        return result;
    }


    public static void timesTwo(ArrayList<Integer> nums){
        for (int i=0;i<nums.size();i++){

           nums.set(i,nums.get(i)*2);
        }

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
        ArrayList<Integer> result=new ArrayList<>();

        for (int i=0;i<nums.size();i++){

            result.add(nums.get(i));
            result.add(nums.get(i));
        }
        return result;

    }

    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2){

        String z="";
        String f="";

        z=list.get(pos1);
        f=list.get(pos2);
        list.set(pos1,f);
        list.set(pos2,z);
        return list;
    }



}
