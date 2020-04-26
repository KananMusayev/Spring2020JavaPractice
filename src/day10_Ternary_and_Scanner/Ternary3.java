package day10_Ternary_and_Scanner;

public class Ternary3 {
    public static void main(String[] args) {
        int n1= 100;
        int n2=600;
        int n3=300;
        int max = n1>n2&&n1>n3?n1
                    :n2>n1&&n2>n3?n2
                        :n3;
        System.out.println(max);
    }
}
