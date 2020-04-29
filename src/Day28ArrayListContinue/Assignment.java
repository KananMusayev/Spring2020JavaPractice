package Day28ArrayListContinue;

import java.util.ArrayList;

public class Assignment {
    public static void main(String[] args) {


        /*
         Extract digits and letters from a String
         */


        String a="kh24g5j436h6";
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<String > c=new ArrayList<>();
        for (int i=0;i<a.length();i++){
            if (Character.isAlphabetic(a.charAt(i))){
                c.add(a.substring(i,i+1));
            }
            else if (Character.isDigit(a.charAt(i))){
                b.add(Integer.parseInt(a.substring(i,i+1)));
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}
