package Leetcode;

public class Youtube_StringQuestion {

    int a;
    public static void main(String[] args) {












        String a="DBCABA";//->A;  BCABA-> B;  or ABC->Null or non
        String result="";
        for (int i=0;i<a.length();i++){
            int count=0;
            for (int k=0;k<a.length();k++){
                if (a.substring(i,i+1).equals(a.substring(k,k+1))){
                    count++;
                }
            }
            if (count>1){
               result=a.substring(i,i+1);
               break;
            }
            else {
                result=a;
            }
        }
        System.out.println(result);

    }
}
