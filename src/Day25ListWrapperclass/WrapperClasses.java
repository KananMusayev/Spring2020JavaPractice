package Day25ListWrapperclass;

import java.util.Arrays;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        every primitives in java has a class
        that is designed to it
        primitives:
                        byte,short, int,   long,float,double,boolean,char
        Wrapper classes:Byte,Short,Integer,Long,Float,Double,Boolean,Character

        All these classes above are presented in the "Java,lang" package but u dont
        have to write import to get it

        String class is also presented in "java.lang" package
        All classes in package "java.lang" are imported by default
         */

        int numInt=10;//this is primitive
        Integer NumInteger=10;//this is a class

        double numdouble=5.5;
        Double numDouble=5.5;

        long longnum=20L;
        Long Longnum=longnum;//u can assign the primitive to -->
        // wrapper class and it is called AutoBoxing
        //Auto-boxing: converting primitive values to Wrapper class

        System.out.println(longnum);
        System.out.println(Longnum);

        Boolean Booleanresult=false;
        boolean booleanresult=Booleanresult;
        System.out.println(booleanresult);//this is called Unboxing
        //Unboxing is converting Wrapperclass value to primitives

        char ch1='L';
        Character Ch1=ch1;
        char ch3=ch1;


        /*
        default values of primitives:
        byte short int long ==>0
        double float==>0.0
        boolean==>false
        char==>space
         */

        /*
        Default values for Wrapper classes:
        byte short int long==>null
        double float==>null
        boolean==>null
        char==>null
        String==>null
        reason it gives u null : if we dont give any objects
        to class(reference) null will be given by default

         */

        Integer [] arr=new Integer[3];//[0,0,0]
        System.out.println(Arrays.toString(arr));

        Byte [] arr1=new Byte[3];//[0,0,0]
        System.out.println(Arrays.toString(arr1));

        Short [] arr2=new Short[3];//[0,0,0]
        System.out.println(Arrays.toString(arr2));

        Double [] arr3=new Double[3];//[0,0,0]
        System.out.println(Arrays.toString(arr3));

        String  [] arr4=new String[3];//[0,0,0]
        System.out.println(Arrays.toString(arr4));

        Boolean [] arr5=new Boolean[3];//[0,0,0]
        System.out.println(Arrays.toString(arr5));


        System.out.println("================================================");


        int num1=10;
        //num1.method()  primitive variable doesnt have method
        //bcs variable num1 is not reference of an object
        //but wrappr classes has methods

        Integer Num1=20;
        int x=Num1.MAX_VALUE;





    }
}
