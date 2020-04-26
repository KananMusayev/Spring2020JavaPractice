package Day21Methods;

public class Task2 {
    /*
    1. write a method that can print all odd number between 1 ~ 100
     */

    public static void main(String[] args) {
        oddnum();
    }

    public static void oddnum(){

        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
