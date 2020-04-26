package ClassTasks;

import java.util.Arrays;

public class Muhtarstaskwarmup {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        for (int i=1;i<=numbers.length;i++){
            numbers[i-1]=i;
        }
        for (int each:numbers){
            if (each%2!=0){
                continue;
            }else {
                System.out.println(each);
            }
        }

    }


}
