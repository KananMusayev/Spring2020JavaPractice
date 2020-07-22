package ClassTasks;

public class task16 {

    public static void main(String[] args) {
        /*
        Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
         */



        int a=10;
        int b=3;
        int count=0;
        for (int i=a;i>=b;i-=b){
           count++;
        }
        System.out.println(count);
    }
}
