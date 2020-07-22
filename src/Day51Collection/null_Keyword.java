package Day51Collection;

import Resources.Sta;

import java.util.ArrayList;

public class null_Keyword {

static String str;// == null
static ArrayList<Integer> list1;


    public static void main(String[] args) {

        //System.out.println(str.toLowerCase());
        //System.out.println(list1.get(1));
        String str2=null;
        Integer i1=null;
        ArrayList<String> list1=new ArrayList<>();
        list1.add(null);
        System.out.println(list1);


    }
}
