package ClassTasks;

import java.util.Arrays;

public class ArraysMethodsrepeating {
    public static void main(String[] args) {
       int []a={1,2,3};
       //to print it use Arrays.toString
        String b=Arrays.toString(a);
        System.out.println(Arrays.toString(a));
        System.out.println(b);

        String[]ab={"Alisa","Esmira","Kenan","Ahmet"};
        String abc=Arrays.toString(ab);
        System.out.println(abc);
        System.out.println(Arrays.toString(ab));

        //int ascending order . From smaller to larger
        //sort method
        int[]Numbers={9,8,100,3000,4,5,6};
        Arrays.sort(Numbers);
        System.out.println(Arrays.toString(Numbers));
        //finding the max num
        System.out.println(Numbers[Numbers.length-1]);
        System.out.println(Numbers[0]);

        String[]ac={"Alisa","Esmira","Kenan","Kenny"};
        Arrays.sort(ac);
        System.out.println(Arrays.toString(ac));

        char[] ch={'0','9','8','5','3','2','1'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println(ch);

        //write a program that can sort the arrays in Descending orderlargest to smallest

        int[]numbers={9,8,100,3000,4,5,6};
        Arrays.sort(numbers);
        int k[]=new int[numbers.length];
        int v=0;
        for (int i=numbers.length-1;i>=0;i--){
            k[v]=numbers[i];
            v++;
        }
        System.out.println(Arrays.toString(k));

        //split method

        String sentence="Today is great day, Good day to learn java";
        String arr[]=sentence.split(" ");
        String abf=Arrays.toString(arr);
        System.out.println(abf);
        abf=abf.replaceAll(",","");
        System.out.println(abf);
        abf=abf.replace("[","");
        abf=abf.replace("]","");
        System.out.println(abf);

        String email="FirstName_Lastname";
        String[]arr2=email.split("_");
        System.out.println(Arrays.toString(arr2));

        String sent ="I love Java and Java is fun, Java is life";

        String dtx[]=sent.split("Java");
        System.out.println(Arrays.toString(dtx));
        System.out.println(dtx.length-1);

        //to CharArray()  returns a char array from the String


        String Str="Java";
        char[]cht=Str.toCharArray();
        System.out.println(Arrays.toString(cht));



    }
}
