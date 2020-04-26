package Day21Methods;

public class Task7 {
    public static void main(String[] args) {
    grade(67);
    }


    public static void grade(int score){
        /*
         write a method called Grade, that can print out the grade based on the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
         */

        if (score>=90&&score<=100){
            System.out.println("A"); }
        else if (score>=80&&score<=89){
            System.out.println("B"); }
        else if (score>=70&&score<=79){
            System.out.println("C"); }
        else if (score>=60&&score<=69){
            System.out.println("D"); }
        else if (score>=0&&score<=59){
            System.out.println("E"); }
        else {
            System.out.println("grade is invalid");
        }



    }
}
