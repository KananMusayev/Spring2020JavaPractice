package Day06_If_Statements;

public class IfStatements {
    public static void main(String[] args) {
        //Single If Statement
        //if ( boolean){some codes to run }


        if (true) {
            System.out.println("Hello");
            System.out.println("Happy Friday");
            System.out.println("Tomorrow is day off");
        }
        if (9 > 10) {
            System.out.println("Hello");
            System.out.println("Happy Friday");
            System.out.println("Tomorrow is day off");
        }


        int a = 1001;
        if (a++ == 1001) {
            //1001==1001 ==>true
            a = 2000;
            System.out.println("a is increased");
            System.out.println(a);
        }
        System.out.println(a + "\n\n\n");
        System.out.println("========================================");
        int x = 987654320;
        if (x % 2 == 0) {
            System.out.println(x);
            System.out.println("it's an even number");


        }

        if (x % 2 != 0) {
            System.out.println(x);
            System.out.println("it's an odd number");
        }

        System.out.println("========================================");
        //
        int Y = 2345678;
        if (Y % 5 == 0) {
            System.out.println(Y);
            System.out.println("is divisable by 5 ");
        }
        if (Y % 5 != 0) {
            System.out.println(Y);
            System.out.println("is not divisable by 5 +\n\n");

        }
        String CEO = "Main Boss";
        String Kuzzat = "Main Boss";
        System.out.println(CEO == Kuzzat);

        if (Kuzzat == CEO) {
            System.out.println("Great Person in the world");//true
            System.out.println("First if block");
        }
        if (Kuzzat != CEO) {
            System.out.println("Great Person in the world");//false
            System.out.println("Second if block+\n\n\n\n");
        }
        int TotalNumber = 100;
        boolean Cybertek = true;
        boolean BestSchool = true;
        if (Cybertek == BestSchool) {
            //     true
            TotalNumber += 500;
        }
        if (Cybertek != BestSchool) {
            TotalNumber -= 50;
        }
        System.out.println(TotalNumber);

        System.out.println("=============================");


        int Age = 78;
        int VoteAge=18;
        if (Age >= VoteAge) {
            System.out.println("Yes you are  eligable to vote for D.Trump ");
        }
        if (Age < 18) {
            System.out.println("No you are not eligable to vote for D.Trump  ");
        }
        int num1=100;
        int num2= 300;
        int max = 0 ;

        if (num1>num2) {
            max = num1;
                }
        if (num1<num2){
            max = num2;
        }

        System.out.println("Maximum number between "+num1+" and " +num2+ " is: "+max);
        }


    }







