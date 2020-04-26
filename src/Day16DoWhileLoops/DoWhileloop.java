package Day16DoWhileLoops;

public class DoWhileloop {
    public static void main(String[] args) {

        boolean A=false;

        while (A){
            System.out.println("Hello"); }



        do { System.out.println("a");
        }while (A);

        /*
        print all even nums between1~100
         */
        int x =1;
        do {
            if (x%2==0){
                System.out.println(x+"");
            }
            x+=1;
        }while (x<=100);

        do {
            System.out.println("Hello world");
            break;}
        //if you write anything after brake it doesnt read.
            while (true);








    }
}
