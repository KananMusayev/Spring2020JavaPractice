package Rephlits;

public class AssesmentTest3point3 {
    public static void main(String[] args) {

    }
    public static String[] reverse(String[] arr) {

        String []result=new String[arr.length];
        int z=0;
        for (int i=arr.length-1;i>=0;i--){
            result[z]=arr[i];
            z++;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=result[i];
        }
        return arr;
    }

    }
