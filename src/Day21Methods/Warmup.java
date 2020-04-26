package Day21Methods;

public class Warmup {
    public static void main(String[] args) {
        /*
        1.create an int array called numbers
        that has length of 100
        2.assign 1~100 to the array's indexes
        3.use for each loop to pring out all even nums

         */

        int [] numbers=new int[100];
        int k=1;
            for (int i=0;i<numbers.length;i++){

                numbers[i]=k;
            k++;}


            for (int each:numbers){
                if (each%2!=0){
                continue;
            }
                else{
                    System.out.println(each);
                }}}



}
