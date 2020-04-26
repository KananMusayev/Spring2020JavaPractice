package Day24Method_Overloading;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import javax.management.openmbean.TabularData;
import java.util.Arrays;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        sum(10,20);
       // int max =sum(10,20);//the mothod doesnt return any value

        addition(5,10);//this method is an int value
        System.out.println(addition(5,10));
        int a=addition(5,10);
        System.out.println(a);
        //also we can assignt it to any other variable as long as
        // that variable range is bigger than what was provided
        //or only if u do explicit casting u can do it. for ex:

        byte num=(byte)addition(6,10);
        System.out.println(num);
        //however u can assign it to bigger variables easily with implicit casting
        float num1=addition(10,20);

        //int max =maximum(40,60,70);//u cant assign bcs double is larger than in. u can cast tho
        int max=(int)maximum(40,60,70);
        System.out.println(max);


        int []arr={20,30,1,2,3,5,9};
        int maxnum=arraymax(arr);
        System.out.println(maxnum);


        int[] arr2={10000,90000,823112,762112,654312};
        int maxnum2=arraymax(arr2);
        System.out.println(maxnum2);




        int abd[]={10,20,50,60,90};
        int abc = returnmin(abd);
        System.out.println(abc);


        int elifba[]={43,54,67,85,78,42,80,56};
        int result=returnmax(elifba);
        System.out.println(result);










    }
    //write a method that accepts an int array
    //returns the min num from the array


    public static int returnmin (int abd[]){
        Arrays.sort(abd);
        return abd[0];
    }


    //return another minimum just to practice

    public static int returnmax(int elifba[]){
        Arrays.sort(elifba);
        return elifba[elifba.length-1];
    }









    //write a method that accepts an int array
    //returns the max num from the array

    public static int arraymax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static int addition(int a,int b){
        return a+b;
    }


    public static double maximum(int a, int b, int c){
        int arr []={a,b,c};
        Arrays.sort(arr);
        return arr[arr.length-1];
    }





}
