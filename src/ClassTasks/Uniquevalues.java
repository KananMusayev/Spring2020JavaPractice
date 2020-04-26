package ClassTasks;

public class Uniquevalues {
    public static void main(String[] args) {
        /*
        Write a program that can print out the unique values
        from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B

         */

        String []a={"A","A","B","C","C"};
        for (int k=0;k<a.length;k++) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]== a[k]){
                    count++;
            }
        }
            if (count==1){
                System.out.println(a[k]);
            }
    }


        for (String each:a){
            int count1=0;
            for (String each2:a){
                if (each.equals(each2)){
                    count1++;
                }
            }
            if (count1==1){
                System.out.println(each);
            }
        }

}}
