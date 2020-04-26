package Day19ArrayContinue;

import java.util.Scanner;

public class Warmupuniquevalues {
    public static void main(String[] args) {
        /*
        write a program that can print out the unique values
        from int array
        Ex:arr->{1,1,2,3,3}
        output->2
         */
        Scanner input =new Scanner(System.in);
        int given[]={1,1,2,3,3};
        for (int k=0;k<given.length;k++){
            int count=0;

            for (int i=0;i<given.length;i++){

            if (given[i]==given[k]){
                count++;
            }
        }
        if (count==1){
            System.out.println(given[k]);;
        }}

    }
}
