package Day16DoWhileLoops;

public class Whileloop5 {
    public static void main(String[] args) {
        /*
        by using while loop print all the even numbers between 1~100
         */
        int num =0;
        while (true){
            num+=1;
            if (num<100&&num>0){
                if (num%2==0)
                System.out.println(num);
            }
        }


    }
}
