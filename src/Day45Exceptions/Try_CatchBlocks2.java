package Day45Exceptions;

public class Try_CatchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("Catch");
        }
        System.out.println("World");





    }
}
