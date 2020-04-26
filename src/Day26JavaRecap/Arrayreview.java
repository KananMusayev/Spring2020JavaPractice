package Day26JavaRecap;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayreview {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

        System.out.println("Please enter 3 numbers:");

        int arr[]=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);


    }
}
