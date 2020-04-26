package Day19ArrayContinue;

public class Warmup2 {
    public static void main(String[] args) {
        /*
        write a program that can print out the unique values
        from string array
         */

        String [] a = {"A","A","B","C","C"};
        //index         0   1   2   3   4
        for (int k =0;k<a.length;k++){
            int count =0;
            for (int i =0;i<a.length;i++){
            if (a[i].equals(a[k])){
                count++;
            }
        }
        if (count==1){
            System.out.println(a[k]);}
        }
    }
}
