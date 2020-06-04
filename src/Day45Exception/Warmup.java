package Day45Exception;

public class Warmup {
    public static void main(String[] args) {
        int pushups =0;
        int numbers=1;
        while (pushups<20){
            System.out.println("pushup"+(pushups+1));
            try {
            Thread.sleep(300);}
            catch (Exception e){

            }

            pushups++;

        }
    }
}
