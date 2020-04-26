package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit_76 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        String names[]=new String[a];
        for (int i=0;i<a;i++){
            names[i]=inp.next();
        }

        for (int i=0;i<names.length;i++){
            System.out.print(names[i].charAt(0));
        }






    }


}
