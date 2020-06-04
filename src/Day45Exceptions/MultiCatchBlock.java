package Day45Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {


        try {
            System.out.println(100/0);

        }
        catch (ClassCastException e){
            System.out.println("Classcast Exception");
        }catch (NoSuchElementException e){
            System.out.println("No such elemet exception");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println( "Index out of bound exception");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic ");
        }
        catch (RuntimeException e){
            System.out.println("Runtime");
        }
        catch (Exception e){
            System.out.println("Exception");
        }





    }
}
