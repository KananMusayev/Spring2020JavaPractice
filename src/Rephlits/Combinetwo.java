package Rephlits;

public class Combinetwo {
    public static void main(String[] args) {

    }


    public static String[] combineNames(String[] first_names, String[] last_names){
        String []array=new String[first_names.length];

        for (int i=0;i<array.length;i++){
            array[i]=first_names[i]+last_names[i];
        }
        return array;
    }

}
