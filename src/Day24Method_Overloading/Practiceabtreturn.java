package Day24Method_Overloading;

public class Practiceabtreturn {
    public static void main(String[] args) {
        //return "text";//u cant use it in void method
        /*
        System.out.println("Hello");
        return;

       */

      //  System.out.println("ala ala ala ");
        //anything after return statement it will give error;

        /*if(true){
            return;
        }*/

        System.out.println("hello");//once return executes
        //it exits the method and whatever is after it it willnt be possible to reach

        for (int i=0;i<5;i++){
            if (i==3){
                return;
            }
            System.out.println(i);
        }

        System.out.println("completed");
        //difference between the break and return is return exits the method
        //but break only exits the loop




    }
}
