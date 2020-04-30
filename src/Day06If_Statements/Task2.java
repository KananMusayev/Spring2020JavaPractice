package Day06If_Statements;

public class Task2 {
    public static void main(String[] args) {
        int hour = 21;
        int minute = 78;
        int second = 33;
        String AmorPm = "AM";
            if      (hour < 24 && hour>0){}
            if (minute<60 && minute>0){}
            if (second<60 && second>0){}
            System.out.println( hour + " : " + minute + " : " +
                    second + " " + AmorPm);



           // if      (hour > 24 || hour <0) {}
            //else if (minute > 60 || minute < 0){}
           // else if (second > 60 || second < 0){}
               //     System.out.println("Given value is not correct");


    }}