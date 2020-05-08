package Rephlits;

public class AlterArray {
    public static void main(String[] args) {



    }

    public static void mystery(int[] array){

        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                array[i]=array[i]/2;
            }
            else{
                array[i]=array[i]*10;
            }
        }
    }

}
