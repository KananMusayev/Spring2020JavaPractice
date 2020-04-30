package Day09Switch_Statements;

public class SwitchStatement {
    public static void main(String[] args) {
        int score =3;
        if (score==2){
            System.out.println("1"); }
        else if (score==2){
            System.out.println("2"); }
        else {
            System.out.println("invalid"); }


        switch (score){
            case 1:
                System.out.println("1");
            break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("invalid");
                break; }




        switch (score){
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("invalid");
                break;
            case 1:
                System.out.println("1");
                break;}
        System.out.println("=======================");

        String str = "Java";
        switch (str){
            default:
                System.out.println("Invalid");
                break;
            case "C#":
                System.out.println("C# programming language");
                break;
            case "Python":
                System.out.println("Python programming Language");
        break;}


        System.out.println("=========================================");

        char Grade = 'A';
        switch (Grade){
            default:
                System.out.println("Failed");
            case 'B':
                System.out.println("Passed with B");
            case 'C':
                System.out.println("Passed with A"); }



                int num =5;
        switch (num) {
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid entry");
                System.out.println("invalid ");
                break;
            //used for exiting the swith statement
            case 5:
                System.out.println("Friday");
                System.out.println("please");
                break;
        }

        System.out.println("=====================================");

        String days = "Friday";
        switch (days){
            default:
                System.out.println("Invalid");
            case "Tuesday":
                System.out.println("Tuesday is Great day");

            case "Monday":
                System.out.println("Funday");
break;
            case "Wednesday":
                System.out.println("Wednesday is day off"); }


char grade = 'A';
        if (grade == 'A'||grade=='B'){
            System.out.println("Passed the exam");
        }else{
            System.out.println("Failed");}


        System.out.println("=======================");
            switch (grade){
                case 'A':
                    break;
                case 'B':
                    System.out.println("Passed the exam");
                    break;
                default:
                    System.out.println("failed the exam");
            }

            String US = "USA";
            if (US=="USA" || US=="America" || US=="US") {
                System.out.println("American");
            } else {
                System.out.println("Not American"); }


        System.out.println("================");

            switch (US){
                case "US" :
                    case "USA":
                case "American":
                    System.out.println("American");
                    break;
                default:
                    System.out.println("Not American");
                break;
            }

}}
