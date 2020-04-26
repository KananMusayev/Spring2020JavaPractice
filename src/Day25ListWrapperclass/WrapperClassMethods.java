package Day25ListWrapperclass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        /*
        Max Value Method: returns the maximum value of the primitive
         */

        Integer num=20;
        int x=num.MAX_VALUE;
        System.out.println(x);//2147483647

        int maximum=Integer.MAX_VALUE;
        System.out.println(maximum);//2147483647

        double maximumval=Double.MAX_VALUE;
        System.out.println(maximumval);//1.7976931348623157E308

        byte maxbyte=Byte.MAX_VALUE;
        System.out.println(maxbyte);//127

        char maxchar=Character.MAX_VALUE;
        System.out.println(maxchar);



        /*
        Min Value :prints out the minimum value of the primitive
         */

        short minshort=Short.MIN_VALUE;
        System.out.println(minshort);//-32768
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE);//-2137483648


        System.out.println("=================================");


        /*
        Parse Methods:used for converting String value to primitives
        ex : parseInt("strValue"):takes the String and converts the string to int
         */

        Integer num1=Integer.parseInt("123");//autoboxing
        System.out.println(num1);
        int num2=Integer.parseInt("125");//non
        System.out.println(num2);

        /*
        ParseByte: takes the string and converts it to byte
         */

        Byte.parseByte("125");
        //byte a=Byte.parseByte("129"); its gonna give error bcs its out of range
        int abc=Byte.parseByte("18");//none
        System.out.println(abc);

        Byte abc1=Byte.parseByte("18");//autoboxing
        System.out.println(abc1+1);

        short bnum=Short.parseShort("200");//none
        System.out.println(bnum+1);

        Short cnum=Short.parseShort("300");//autoboxing
        System.out.println(cnum+1);


        Long lnum=Long.parseLong("40");
        System.out.println(lnum+1);

        //int num7 =Long.parseLong("1222"); u cant assign to to range

        //however u can cast
        int num7=(int)Long.parseLong("1222");
        long num8=Long.parseLong("1222");
        System.out.println(num7);
        System.out.println(num8);

        float num9=Float.parseFloat("12.5");
        System.out.println(num9);

        Float num10=Float.parseFloat("13.8");//autoboxing
        System.out.println(num10+1);

        float w=Float.parseFloat("10.9f");//u can also write f
        System.out.println(w);
        float num11=10.5F;

        float num22=(float)Double.parseDouble("9.4");
        System.out.println(num22);
        float num42 = (int)Double.parseDouble("8.5");//will give u 8
        System.out.println(num42);

        Double num13=Double.parseDouble("7.1");
        System.out.println(num13);


        boolean A=Boolean.parseBoolean("true");
        //anything other than true it will give false
        System.out.println(A);
        boolean B =Boolean.parseBoolean("hastpust");
        System.out.println(B);

        boolean C=Boolean.parseBoolean("TRUE");//still works and prints true
        //it ignores the case sensetivity
        System.out.println(C);
        boolean D=Boolean.parseBoolean("5>3");//false
        System.out.println(D);

        Boolean W = Boolean.parseBoolean("TRUE");//autoboxing
        System.out.println(W);


        int a=10;
        double b=a;
        //Double s=a; u cant assign
        //bcs Double wrapper class is only Dedicated to double primitive



        int qr=Byte.parseByte("19");
        //Integer A2 = Byte.parseByte("19");
        Integer A2 = (int)Byte.parseByte("19");

       // Short R=(byte)Double.parseDouble("10.9");
        Short R=(short)Double.parseDouble("10.9");


        System.out.println("==================================");


        /*
        Value of method:used to convert string to wrapper class values
        It is just opposite of parse method
         */

            int z=Integer.valueOf("123");//unboxing
            Integer z1=Integer.valueOf("1234");//none

            Integer z2=(int)Integer.valueOf("1234");//autoboxing

            boolean result1= Boolean.valueOf("FALSE");//unboxing
        System.out.println(result1);//false and same with parse valueof method also ignores the cse sensetivity

            int totalNumber=100;
            String str3=""+totalNumber;//none










    }
}
