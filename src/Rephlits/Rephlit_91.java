package Rephlits;

public class Rephlit_91 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        doubleArr(a);
        //prints array



    }

    public static void doubleArr(double[][] array)
    {
            for (double []Array1D:array){
                for (double Array2D:Array1D){
                    System.out.println(Array2D*2+" ");
                }
                System.out.println();
            }
    }


}
