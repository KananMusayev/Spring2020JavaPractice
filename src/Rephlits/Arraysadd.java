package Rephlits;

public class Arraysadd {
    public static void main(String[] args) {

    }
    public static int[] addElements(int[] ints1, int[] ints2) {

        int[]result=new int[ints1.length];

        for (int i=0;i<result.length;i++){
            result[i]=ints1[i]+ints2[i];
        }
        return result;


    }
    }
