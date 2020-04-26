package Day18Array;

public class Warmuptask {
    public static void main(String[] args) {
        /*
        write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
         */

        int [] given ={1,2,3,4,5,6};
        int max=0;
        for (int i=0;i<given.length;i++){
            if (given[i]>max){
                max=given[i];
            }
        }
        System.out.println(max);
    }
}
