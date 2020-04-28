package Day25ListWrapperclass;

public class Warmupevening {

    public static void main(String[] args) {
/*
write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
        System.out.println(sum("Today's date is 04/27/2020"));
        String ab="Today's date is 04/27/2020";
        String A="";
        char ch=ab.charAt(ab.length()-2);
        System.out.println(A+ch);

    }

    public static int sum(String a){

        int sum=0;

        for (int i=0;i<a.length();i++){
            char t=a.charAt(i);
            String z="";
            if (t>=48&&t<=57){
                z+=t;
                sum+=Integer.parseInt(z);
            }
        }
        return sum;

    }


}
