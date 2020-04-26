package Day11_Scanner;

public class StringMethods3 {
    public static void main(String[] args) {
         /*
        isEmpty():
        check if the String is empty and returns boolean expressions
         */
         String abc = "Cybertek";
        System.out.println(abc.isEmpty());
        String abc1 = "";
        if (abc1.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.println("not empty");
        }

        /*
        equals(str):
        checks if the 2 strings visible text are equal or not
         */
        String A1="Cybertek";
        String A2 = new String("Cybertek");
        System.out.println(A1==A2);//false
        boolean R1=A1.equals(A2);
        System.out.println(R1);
        System.out.println("java".equals("Java"));//case sensetivity

        /*
        equalsIgnoreCase(str) Checks if the two String visible text are
        equal or not then returns boolean expression
        case sensitivity doesnt matter
         */
        String q1 = "JAVA";
        String q2 = new String("java");
        System.out.println(q1==q2);//false bcs diff loca
        System.out.println(q1.equals(q2));//false bcs of case sensetivity
        System.out.println(q1.equalsIgnoreCase(q2));//true

        /*
        contains(str):checks if the str is contained in the String or not
        returns boolean expression
         */
        String name = "Muhtar";
            boolean Result =name.contains("Good Guy");//false
        System.out.println(Result);
        String name2 = "Marufjon";
        System.out.println(name2.contains("m"));//false case sensitivity

        /*
        startsWith("str") checks if the string is started with str or not
         */
        String esmira = "Alisa";
        System.out.println(esmira.startsWith("L"));//false
        String kenan = "Cybertek School is great place to learn java ";
        System.out.println(kenan.startsWith("Cybertek School"));//true

        /*
        endsWith method
         */

        String Alisa = "Salam Alisa bebe";
        System.out.println(Alisa.endsWith("bebe"));










    }
}
