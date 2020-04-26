package Day18Array;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        String student1="ali";
        String student2 ="mehmet";
        String student3="nicat";//...



        String[] Allstudents={"ali","mehmet","nicat"};
        Allstudents[0]="Marufjon";
       // Allstudents[3]="Muhtar";//Array's size is fixed u cant add more than length
        System.out.println(Allstudents.length);
        //initialize the size only without giving value

        int[] array = new int[4];//this array can contain 4 values and length is 4

        System.out.println(array.length);
        System.out.println(array[0]);//it will give 0 bcs default int value is 0
        System.out.println(array[1]);// will give 0 as well
        System.out.println(array[2]);// will give 0 as well because it hasnt been initialized
//give values to the array:
        array[1]=100;
        System.out.println(array[1]);
        System.out.println(array[0]);//will give u 0 bcs hasnt been initialized
        array[0]=200;
        System.out.println(array[0]);//now it will give u 200 bcs we just initialized it
        /*array[5]=500;
        System.out.println(array[5]);
        //will give u compile error bcs its size is fixed. no more than4
        */
        int[] array2;
        //System.out.println(array2[0]); array size must be initialized
        Scanner input = new Scanner(System.in);
//the new keyword in array is used to give the size of the array
        int [] inputs=new int[10];
        //in this array on top we can store 10 elements
        //and highest number of index is 9

        for (int i =0;i<inputs.length;i++){
            System.out.println("PLease enter a number");

            inputs[i]=input.nextInt(); }
        for (int i =0;i<inputs.length;i++){
            System.out.print(inputs[i]+""); }



    }
}
