package Leetcode;

public class fdfd {

    public static void main(String[] args) {


//D

        String a="DCABA";//->A;  BCABA-> B;

        for (int i =0; i<a.length(); i++ ){
            int count=0;
            for (int k= 0;k<a.length();k++ ){
                if (a.substring(i,i+1).equals(a.substring(k,k+1))){
                    count++;
                }
            }
            if (count>1){
                System.out.println(a.substring(i,i+1));
            }
        }





    }
}
