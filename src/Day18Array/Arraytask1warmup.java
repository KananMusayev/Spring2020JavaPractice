package Day18Array;

public class Arraytask1warmup {
    public static void main(String[] args) {
        /*
        Write a program that can return the maximum value
        from an int array and then find the second max num
         */
        int [] abc ={20,200,30,40,50,500};
        int max=0;
        for (int i =0;i<abc.length;i++){
            if (abc[i]>max){
                max=abc[i]; } }
        System.out.println(max);
        int secondmax=0;
        for (int k=0;k<abc.length;k++){
            if (abc[k]>secondmax&&abc[k]<max){
                secondmax=abc[k];
            } }
        System.out.println(secondmax);
    }
}
