package Day18Array;

public class Warmuptask2 {
    public static void main(String[] args) {
        /*
        write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
         */
        int given []={1,4,5,7,9,0};
        int min=999999999;
        for (int i =0;i<given.length;i++){
            if (given[i]<min){
                min=given[i];
            }
        }
        System.out.println(min);
    }
}
