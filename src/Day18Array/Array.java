package Day18Array;

public class Array {
    public static void main(String[] args) {



        int [] arr={1, 2};
        String [] names ={"Nigar","Sumeyya","Ali","Ahmed"};
        // index of         0          1       2      3
        System.out.println(names[0]);
        System.out.println(names[1]);
        String abc=names[2];
        String abd=names[3];
        System.out.println(abc);
        System.out.println(abd);
        //System.out.println(names[4]);
        //will give u error bcs there is no index4 given on top

        double[] myArray={1,2,3,4,5,8,0,2};
        //indexes         0 1 2 3 4 5 6 7
        for (int i=0;i<8;i++){
            System.out.println(myArray[i]+" ");}


            //lengthof Array
            int[] numbers={12,24,48,96,2,3,4,5,6,7,8,9,10,11};
            int b=numbers.length;
            System.out.println(b);
            int highestindexnum=numbers.length-1;
        System.out.println(highestindexnum);

        for (int k=0;k<numbers.length;k++){
            System.out.println(numbers[k]); }

        char [] myChars ={'A','B','C','D'};
        int a=myChars.length;
        System.out.println(a);

    }
}
