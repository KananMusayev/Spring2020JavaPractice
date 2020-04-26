package Day17NestedLoop;

public class task3 {
    public static void main(String[] args) {
        /*
        Print the one below:
        *
        **
        ***
        ****
        *****
        ******
        *******
        */

        for (int i =1;i<=7;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"); }
            System.out.println();
        }
    }
}
