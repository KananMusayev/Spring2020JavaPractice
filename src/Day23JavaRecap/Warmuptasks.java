package Day23JavaRecap;

import java.util.Arrays;

public class Warmuptasks {
    public static void main(String[] args) {


    KmtoMiles(5);
    gallonstoliters(9);
    Calculate(5,8,"*");
    int arr[]={0,-1,1000,2000,5000};
    Descendingorder(arr);
        System.out.println();
    Grade(78);

    }


    public static void Grade(int grade){
        if (grade >= 90 && grade <= 100){
            System.out.println("A"); }
        else if (grade >= 80 && grade <= 89){
            System.out.println("B"); }
        else if (grade >= 70 && grade <= 79){
            System.out.println("C"); }
        else if (grade >= 60 && grade <= 69){
            System.out.println("D"); }
        else if (grade >= 0 && grade <= 59){
            System.out.println("F"); }
        else {
            System.out.println("Invalid Score"); }
    }

    public static void Descendingorder(int[]array){

       Arrays.sort(array);
       for (int i=array.length-1;i>=0;i--) {
           System.out.print(array[i]+" ");
       }
    }

    public static void Calculate(int a,int b,String c){
      if (c=="*"){
          System.out.println(a*b); }
      else if (c=="/"){
          System.out.println(a/b); }
      else if (c=="+"){
          System.out.println(a+b); }
      else if (c=="-"){
          System.out.println(a-b); }



    }


        public static void gallonstoliters(int gallons){
        double liters=gallons*3.78 ;
        System.out.println(liters); }


        public static void KmtoMiles(int km){
        double miles=km*0.62;
            System.out.println(miles); }


}
