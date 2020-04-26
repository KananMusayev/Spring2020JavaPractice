package Day22Methods;

public class VoidMethod_withArgument {
    public static void main(String[] args) {
     //   OddOrEven();
        //method is designed to take an argument.
        // needs argument to perform its task
        OddOrEven(37);//a ucun reqem verisen . reqem yazilmalidi
        //OddOrEven(8.5); bcs u cant assign decimal to int
        int z=100;
        OddOrEven(z); //to add a variable is also possible
        sumofany2nums(35,54);
        removingduplicatesfromString("abbbbccdsa");
    }

    public static void removingduplicatesfromString (String a){
        String empty ="";
        for (int i=0;i<a.length();i++){
            if (!(empty.contains(""+a.charAt(i)))){
                empty+=a.charAt(i);
            }
        }
        System.out.println(empty);


    }



    public static void sumofany2nums(int a, int b){

        System.out.println("Sum of "+a+" and "+b+" is : "+(a+b)); }

    public static void OddOrEven(int a) {
            if (a%2==0){
                System.out.println(a +" is even number"); }
            else {
                System.out.println(a +" is odd number"); } }



}
