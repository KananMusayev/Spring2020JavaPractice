package Day19ArrayContinue;

import Day18Array.Array;

import javax.smartcardio.ATR;
import java.util.Arrays;
import java.util.SortedMap;

public class ArrayStringMethods {
    public static void main(String[] args) {
        /*
        split(str):Splits the String by given value
        and returns it as String array


        toCharArray():
         */

        String sentence="Today is great day,Good day to learn Java";
                        String[] arr=sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        String email="FristName_LastName";
        String []arr2=email.split("_");
        System.out.println(Arrays.toString(arr2));
        String a= Arrays.toString(arr2);
        System.out.println(a);
        a=a.substring(1,a.length()-1);
        System.out.println(a);

        String fullName ="Cybertek School Batch12";//there are 2 spaces
        String [] array=fullName.split(" ");
        System.out.println(Arrays.toString(array));


        String java="I love Java and Java is fun, Java is life";

        String [] array2=java.split("Java");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length-1);

        /*
        find out how many times
        python is accured in the string

         */
        String pyton="Python is good,i love Python, Python is life";
        String[] given =pyton.split("Python");
        System.out.println(Arrays.toString(given));
        int result = given.length-1;
        System.out.println(result);

        String emailAddress="Cybertek_school_batch12@gmail.com";
        //                  firstnam  middlen  lastn
        //String firstname=emailAddress.substring(0,emailAddress.indexOf("."));
        //System.out.println(firstname);
        //String middlename= emailAddress.substring(emailAddress.indexOf("k")+2,emailAddress.indexOf(".b"));
        //System.out.println(middlename);
        String FullName=emailAddress.substring(0,emailAddress.indexOf("@"));
        String aa[] =FullName.split("_");
        System.out.println(Arrays.toString(aa));
        String firstname=aa[0];
        String middlename=aa[1];
        String lastname=aa[2];
        System.out.println(firstname);
        System.out.println(middlename);
        System.out.println(lastname);

        String word ="ABCDEFG";
        String ww[]=word.split("");//gonna give u all the characters from the word string
        //as an array string
        System.out.println(Arrays.toString(ww));


        /*
        toCharArray() :
        returns a char array from the String
         */
        String qwe="Java";
            char [] qaz=    qwe.toCharArray();
        System.out.println(Arrays.toString(qaz));



    }
}
