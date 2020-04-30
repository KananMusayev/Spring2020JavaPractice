package day10Ternary_and_Scanner;

public class warmup {
    public static void main(String[] args) {
        /*Write a program that can display the days
        if the day is Monday or Tuesday :Java Class Days
        if the day is Thursday or Friday :Selenium Class
        if the day is wednesday or saturday :SQL class days
        otherwise : day off
        Donot use if statement

         */
        String day = "Sunday";
        switch (day){
            case "Monday":
            case "Tuesday":
                System.out.println("Java Class Days");
                break;
            case "Thursday":
            case "Friday":
                System.out.println("Selenium class days");
                break;
            case "Wednesday":
            case "Saturday":
                System.out.println("SQL class days");
                break;
            default:
                System.out.println("Day off"); }




    }

}
