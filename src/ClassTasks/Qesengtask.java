package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Qesengtask {


    public static void main(String[] args) {

        String str = "101sda1500aw1wq24";
        ArrayList<String >list=new ArrayList<>();
        int sum=0;
        ArrayList<Integer>list1=new ArrayList<>();
        String a="";
        for (int i=0;i<str.length();i++){

            if (Character.isDigit(str.charAt(i))){
                a+=str.substring(i,i+1);
                if (i+1==str.length()){
                    list1.add(Integer.parseInt(a));
                    break;}

                if (Character.isAlphabetic(str.charAt(i+1))){
                    list1.add(Integer.parseInt(a));
                    a="";
                }}


        }
        System.out.println(list1);
        for (int i=0;i<list1.size();i++){
            sum+=list1.get(i);
        }
        System.out.println(sum);










/*
        int a[]={1,3,5};
        int b[]={2,4,6};
        int c[]=new int[a.length+b.length];
        int k=0;
        int r=1;
        for (int i=0;i<a.length;i++){
            c[k]=a[i];
            c[r]=b[i];
            k+=2;
            r+=2;
        }
        System.out.println(Arrays.toString(c));

 */
    }
}
