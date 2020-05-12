package Day36Static;

import java.util.ArrayList;
import java.util.Arrays;

public class ConstructorandStaticPractice {



    public static String name;

    public static int[]arr1;

    public static ArrayList<String > list = new ArrayList<>();
    static {
        name="Static 1";
        arr1=new int[5];//{0,0,0,0}
        arr1[0]=1;
        arr1[2]=3;
        list.add("Coffee");
        list.add("Tea");

    }

    static {
        name="Static 2";
        arr1=new int[3];//{0,0,0}
        arr1[1]=2;
        list.add("Break");

    }

    public static void main(String[] args) {
        ConstructorandStaticPractice obj1=new ConstructorandStaticPractice();

        System.out.println(name);
        System.out.println(Arrays.toString(arr1));
        System.out.println(list);

    }
    public ConstructorandStaticPractice(){
        name="Constructor";
    }
}
