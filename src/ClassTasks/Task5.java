package ClassTasks;

public class Task5 {


    public static void main(String[] args) {
        /*
        String -- Reverse
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
         */

        String a="ABCD";
        String result="";

        for (int i=a.length()-1;i>=0;i--){
            result+=a.substring(i,i+1);
        }
        System.out.println(result);

    }
}
