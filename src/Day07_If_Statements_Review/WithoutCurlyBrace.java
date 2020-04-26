package Day07_If_Statements_Review;

public class WithoutCurlyBrace {
    public static void main(String[] args) {
        // only one line belongs to if statement
        if (true)
            System.out.println("Today is Friday");
            System.out.println("Tomorrow there is no class");
            if (false)
                System.out.println("Hello");
                System.out.println("salam");

      /*else if statement
      if you dont give {} if block is gonna contain one line of statement

       */
      if (true)
          System.out.println("Hello");//if block ends right here
          System.out.println("aloooo");
         // else
          System.out.println("Hola"); //ele statement must be declared right after
        //the if statement
        if (false)
            System.out.println("this is if");
           // System.out.println("abc");
        else
            System.out.println("this is else");

        /*multi branch withour braces
       */

        if (true)
            System.out.println("if block");
        //System.out.println("jfjlfel");//gives compile error
        else if (true)//else if block you must have to have if statement first
            System.out.println("else-if block");
        //System.out.println("ehljeff"); gives compile error
        else// else block is not mandatory
            System.out.println("else block");







}}
