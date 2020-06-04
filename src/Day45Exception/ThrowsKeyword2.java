package Day45Exception;

import java.io.IOException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws Exception{
        System.out.println("Java");

        Thread.sleep(300);

        System.out.println("Cybertek");

        Thread.sleep(300);

        System.out.println("Batch 18");

        Thread.sleep(300);

        System.out.println("Completed");


    }
    public static void method1()throws IOException,Exception{
        Thread.sleep(300);
    }
}
