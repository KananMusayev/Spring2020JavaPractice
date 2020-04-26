package Day07_If_Statements_Review;

public class MultiBranchifstatement {
    public static void main(String[] args) {
        //
        if (true){
            System.out.println("if block");}
        else if (true){
            System.out.println("else if block"); }
        else {
            System.out.println("Else block");
    }

        /*
        Task 1.
        90<=Grade===>A
        80<=Grade===>B
        70<=Grade===C
        60<=Grade===>D
        Else===>F
         */
         int grade = 75;
         if (grade>=90){
             System.out.println("you got A, Great job");}
         else if (grade>=80&&grade<90)
             System.out.println("You got B, Good");
         else if (grade>=70&&grade<80)
             System.out.println("You got C, thats okay");
         else if (grade>=60&&grade<70)
             System.out.println("You got D, Really?");
         else {
             System.out.println("You got F,Study More");
         }


         /*Task 2 .
         status code = 200
         200 = OK
         201 = Created
         202 = Accepted
         301 = Moved Permanently
         304 = Not Modified
         307 = Temporary Redirect
         400 = Bad Request
         401 = Unauthorized
         403 = Forbidden
         404 = Not Found
         410 = Gone
         500 = Internal Service Error
         503 = Service Unavailable
          */

         int statuscode = 509;
        if (statuscode == 200) {
            System.out.println("Ok"); }
        else if (statuscode == 201) {
            System.out.println("Created"); }
        else if (statuscode==202){
            System.out.println("Accepted"); }
        else if (statuscode==301){
            System.out.println("Moved Permenantly");}
        else if (statuscode==303){
            System.out.println("See other");}
        else if (statuscode==304){
            System.out.println("Not Modified");}
        else if (statuscode==307){
            System.out.println("Temporary Redirect");}
        else if (statuscode==400){
            System.out.println("Bad Request"); }
        else if (statuscode==401){
            System.out.println("Unauthorized");}
        else if (statuscode==403){
            System.out.println("Forbidden");}
        else if (statuscode==404){
            System.out.println("Not Found");}
        else if (statuscode==410){
            System.out.println("Gone");}
        else if (statuscode==500){
            System.out.println("Internal Server Error");}
        else if (statuscode==503){
            System.out.println("Service Unavailable");}
        else {
            System.out.println("Invalid Status Code");
        }

        System.out.println(" ====\n\n\n\n ");




        /*Task 3
        Write a Program that :
        1. 0~12 == >good morning
        2. 12~15 ==> good afternoon
        3. 15~23 ==>good evening

         */
        int hour = 65;
        if (hour>15&&hour<23){
            System.out.println("Good evening");}
        else if (hour>12&&hour<15){
            System.out.println("Good Afternoon");}
        else if (hour>0&&hour<12){
            System.out.println("Good Morning"); }
        else {
            System.out.println("Not a valid request\n\n\n"); }


        /*Task 4
        Int num1 , num2, num3 find the bigger number

         */

        int num1 = 102;
        int num2 = 102;
        int num3 = 102;
        if (num1>num2&&num1>num3){
            System.out.println(num1+" is the biggest number"); }
        else if (num2>num1&&num2>num3){
            System.out.println(num2+" is the biggest number"); }
        else if (num3>num1&&num3>num2){
            System.out.println(num3+" is the biggest number");}
        else if (num1==num2 && num1>num3){
            System.out.println(num1+" and "+num2+" are the biggest numbers"); }
        else if (num1==num3 && num1>num2){
            System.out.println(num1+" and "+num3+" are the biggest numbers"); }
        else if (num2==num3 && num2>num1){
            System.out.println(num2+" and "+num3+" are the biggest numbers"); }
        else{
            System.out.println("All of them are equal"); }



    }}
