package Rephlits;

public class BadProducts {

    public static boolean badP(int[] products,int limit)
    {boolean result=true;
    int count=0;
        for (int i=0;i<products.length;i++){
            if (products[i]==0){
                count++;
            }
        }
        if (count>=limit){
            result=false;
        }
        return result;

    }
}
