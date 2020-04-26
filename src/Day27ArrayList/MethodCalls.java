package Day27ArrayList;

public class MethodCalls {
    public static void main(String[] args) {
        method3();
        System.out.println(max(3,5,8));
    }

    public static void method1(){
        System.out.println("A"); }

    public static void method2(){
        method1();
        System.out.println("B");
    }

    public static void method3(){
        method2();
        System.out.println("C");
    }

    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static int max (int a, int b, int c){
        int largestNum=max(a,b);
        return (largestNum>c)?largestNum:c;

    }

    public static void maximum(int a,int b,int c){
        System.out.println(max(a,b,c));
    }



}
