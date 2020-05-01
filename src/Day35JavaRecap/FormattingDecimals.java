package Day35JavaRecap;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {
        //class is presented in "java.text" package

        DecimalFormat format=new DecimalFormat("0.00");

        double b=23.4656475675756;

        /*
        format method:
            format(double): formats the decimals and returns string value
         */
          String num1=  format.format(b);
        System.out.println(num1);
        double c=45.56789;
        System.out.println(format.format(c)+1);//this is string
        c=Double.parseDouble(format.format(c));//this is double variable now

        System.out.println(c+1);

    }
}
