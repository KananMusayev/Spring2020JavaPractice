package Day11_Scanner;

public class WarmUp {
    public static void main(String[] args) {
        /*
        Write a Java program that can convert numbers between 0~9to words
        if the number is greater than 9 or less than 0 ,
        output hould be "Invalid
         */

        int num = 10;
        String result = "";
        if (num>=0&&num<=9){
            if (num==9)
                result="Nine";
            else if (num==8)
                result="Eight";
            else if (num==7)
                result="Seven";
            else if (num==6)
                result="Six";
            else if (num==5)
                result="Five";
            else if (num==4)
                result="Four";
            else if (num==3)
                result="Three";
            else if (num==2)
                result="Two";
            else if (num==1)
                result="One";
            else if (num==0)
                result="Zero"; }
        else {
            result="Invalid"; }
        System.out.println(result);


        int n = 6 ;
        String Result = n==9?"Nine"
                            :n==8?"Eight"
                                 :n==7?"Seven"
                                       :n==6?"Six"
                                            :n==5?"Five"
                                                :n==4?"Four"
                                                       :n==3?"Three"
                                                            :n==2?"Two"
                                                                :n==1?"One"
                                                                      :n==0?"Zero"
                :"invalid";
        System.out.println(n);
    }
}
