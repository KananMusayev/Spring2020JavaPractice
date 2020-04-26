package Day21Methods;

public class Task3 {
    /*
    	2. write a method that can print all even number between 1 ~ 100


     */
    public static void main(String[] args) {
    evennum();
    }
    public static void evennum(){
        int i=1;
       do {
           i++;
           if (i%2==0){
               System.out.println(i);
           }
       }
       while (i<99);
    }
}
