package Day17NestedLoop;

public class Task6 {
    public static void main(String[] args) {
        /*
        convert below to do while loop
        int k=0;
while (k<=7){
    for (int i =1;i<=k;i++){
        System.out.print("*");
                                }
        k++;
    System.out.println();  }

*
**
***
****
*****
******
         */
        int k =0;
        do {
            for (int i =1;i<=k;i++){
                System.out.print("*");
            }
            k++;
            System.out.println();}


            while (k<=7);


    }
}
