package Day45Exceptions;

public class Classtask {
    public static void main(String[] args) {
        /*
         Write a method called "wait" that causes the
         current executing thread to sleep for the specific number of seconds
parameters: double seconds
         */







        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
        System.out.println("Cybertek");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){

        }
        System.out.println("Java");

        try {
            Thread.sleep(4000);
        }
        catch (Exception e){
        }
        System.out.println("Completed");


    }
}
