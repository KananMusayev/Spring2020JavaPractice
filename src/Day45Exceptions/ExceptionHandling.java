package Day45Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

    String str="Cybertek";

    try {
        System.out.println(str.charAt(100));
    }catch (Exception e){
        String discription=e.getMessage();
        System.out.println(discription);
    }
        System.out.println("Completed");


        System.out.println("====================================");


        try {
            System.out.println(100/0);

        }catch (Exception e){


        }







    }
}
