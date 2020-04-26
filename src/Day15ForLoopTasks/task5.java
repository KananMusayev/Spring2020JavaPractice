package Day15ForLoopTasks;

public class task5 {
    public static void main(String[] args) {
        /*
        print all the lowercase and uppercase alphabest from
        ASCII table
         */

        //a~z, A~z

        for (char ch ='a';ch <='z';ch++){
            System.out.println(ch);
        }
        System.out.println("==================");
        for (char ch='A';ch<='Z';ch++){
            System.out.println(ch +" ");
        }
    }
}
