package InteviewquestionsPractice;

import java.util.Arrays;

public class SumofDigitsinString {
    public static void main(String[] args) {


        /*
        String -- sum of digits in a string
Write a method that can return the sum of the digits in a string


         */

        String given="3h5h6k8h6g3fk";
        char[]array=given.toCharArray();
        System.out.println(Arrays.toString(array));
        int sum=0;
        for (int i=0;i<given.length();i++){

            if (Character.isDigit(array[i])){

                sum+=Integer.valueOf(array[i]+"");
            }
        }
        System.out.println(sum);
    }
}
