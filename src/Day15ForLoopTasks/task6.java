package Day15ForLoopTasks;

public class task6 {
    public static void main(String[] args) {
        String a = "Java is a fun language, I love java, java";
        System.out.println(a.indexOf("ava,"));

        String name = "Cybertek School Batch 12";
        //find total characters excluding space
String b = name.replace(" ","");
        System.out.println(b);
        String etta = "Cybertek School Batch 12";

        System.out.println( etta.replace("Cybertek","Family"));
        etta=etta.replace("Cybertek","Family");
        System.out.println(etta);


        String abc = "Java is Fun, Java is object oriented, Java is cool";
        abc = abc.replace("Java is o","C++ is o");
        System.out.println(abc);
        abc = abc.replace("Java is c","C# is c");
        System.out.println(abc);


        String R1 = "Cybertek";//String pool
        String R2 = new String("Cybertek");//heap
        String R3 = new String("cybertek");
        System.out.println(R1==R2);//false due to different locations
        System.out.println(R1.equals(R2));//visible texts are same
        System.out.println(R1.equals(R3));//false bcs case sensetivity
        System.out.println(R1.equalsIgnoreCase(R3));//true it checks the visible text withoit checking sensitivity





    }
}
