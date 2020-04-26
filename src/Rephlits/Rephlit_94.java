package Rephlits;

public class Rephlit_94 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(countNegativeOdd(a)); //should print 3
    }
    public static int countNegativeOdd(int[][] array)
    {
        int count = 0;

        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                if (array[k][i]<0&&array[k][i]%2!=0){
                    count++;
                }
            }
        }
        return count;

    }
}
