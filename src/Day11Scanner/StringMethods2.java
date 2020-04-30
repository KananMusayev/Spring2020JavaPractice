package Day11Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
        /*
        replace(old char,new char):
        replaces all the old char values with the given new char values
        in the String and returns it as a new String value;
        metndeki istenilen herfi basqa herflerle deyishmey olur
         */

        String str1 = "Java is Fun Programming Languge";
            String str2=str1.replace('a','e');
        System.out.println(str2);//Jeve is Fun Progremming Lenguge
        /*
        replace (old str,new str)
        replaces all the old str values with the given
        new str values
         */
        String Str = "Today is gonna be a great day to learn Java";
        String Str2 = Str.replace("Today", "Tomorrow");
        System.out.println(Str2);
        String Str3 = Str.replace("Java", "");
        System.out.println(Str3);

        /*
        replaceFirst(old str,new str):
        it replaces the first occured old str
        with the new str and returns it as a new string value
         */
        String s1 = "Java is fun,Java is good";
        s1=s1.replace("Java", "Python");
        System.out.println(s1);//this one changes both
        String s2 = "Java is fun,Java is good";
        s2=s2.replaceFirst("Java", "Phyton");
        System.out.println(s2);
        s1 = s1.replace('s','S');
        System.out.println(s1);//Python iS fun,Python iS good
        s1 = s1.replace('S', 'G');
        System.out.println(s1);//Python iG fun,Python iG good
        /*
         First indexOf method:
        shows us the index number of the character
         */

        String B1 = "Today is tuesday, today we have class in the afternoon";
        int n1 = B1.indexOf("te");// if you want you can add +1 or +2 after bracket
        System.out.println(n1);
        String address = "7925 Jones Branch Dr , Mclean, Va 22003";
        int beginningIndex = address.indexOf(", ")+2;
        System.out.println(beginningIndex);
        int endingindex = address.indexOf(", V");
        System.out.println(endingindex);
        System.out.println(address.substring(23,29));

        String emailAddress = "RandomEmails@yahoo.com";
        int begindex = emailAddress.indexOf("@")+1;
        int endindex = emailAddress.indexOf(".com");
        String emailtype = emailAddress.substring(begindex,endindex);
        System.out.println(emailtype);

        /*
        Last indexOf method
        returns the last occured character index number as an int value
         */
        String X = "ABCDABCD";
        int x = X.lastIndexOf("B");//also takes char ''
        System.out.println(x);
        String myemail = "Myemail.school@yahoo.com";

        int bi = myemail.indexOf("@")+1;
        int li = myemail.lastIndexOf(".");
        System.out.println(myemail.substring(bi,li));






    }
}
