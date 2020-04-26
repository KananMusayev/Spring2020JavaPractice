package Day15ForLoopTasks;

public class Task7 {
    public static void main(String[] args) {
        String A = "Tomorrow is gonna be a great day to do repl.its";
        A=A.replace(" ","");
        System.out.println(A);

        String B = "Cybertek";
        System.out.println(B.indexOf("t"));
        char C = B.charAt(5);
        System.out.println(C);
        String D = "Please do more and more java practices tomorrow";
        char D1 = D.charAt(D.lastIndexOf("w"));
        System.out.println(D1);


        String sentences = "ABCDEFGHIJKLMN";
int a = sentences.indexOf("A");
int b = sentences.lastIndexOf("N");
        System.out.print(a+",");
        System.out.print(b);

        System.out.println(sentences.charAt(0));

        String x = ""+sentences.charAt(0)+sentences.charAt(sentences.length()-1);
        System.out.println(x);

    }
}
