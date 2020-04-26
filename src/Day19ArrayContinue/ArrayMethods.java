package Day19ArrayContinue;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] num1 = {10, 2, 3, 4, 5};
        //to print entire array as a whole
        //we need to convert arrey to string
        //Arrays.toString(VariableName):used to convert the single dimensional arrays to String
        //Single dimentional means only  one of this==>{}
        //you can also find it in Java.util.

        String b=Arrays.toString(num1);
        System.out.println(b);

        String[]names={"ali","gulbadam","ahmed","coban"};
        String c = Arrays.toString(names);
        System.out.println(c);

        /*
        Arrays.sort(Variablename):
                sorts the values of the arrays in ascending order
                (from smallest to largest)
         */

        int [] numbers={9,8,100,3000,4,5,6,};

        System.out.println( Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Maximum number is : "+numbers[numbers.length-1]);
        System.out.println("Minimum number is: "+numbers[0]);

        String[] namelists={"enes","arzu","sahin","baki","kenan"};
        Arrays.sort(namelists);//Alphabetical order (from ASCIIItable)
        System.out.println(Arrays.toString(namelists));

        char[]ch ={'0','9','8','5','3','2','1'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));







    }
}
