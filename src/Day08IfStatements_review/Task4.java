package Day08IfStatements_review;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program that can find number of days
        in a month
        int month = 0~12
        1     2    3    4   5     6     7    8      9    10   11    12
        jan, feb, mar, apr, may, june, jul , aug , sep, oct , nov, dec
        31    28   31   30  31    30    31    31    30   31    30   31
        use nested if
        28 days : 2
        30 days : 4,6,9,11
        31 days : 1,3,5,7,8,10,12
         */
        int month = 2 ;
        if (month>0&&month<13) {
            if (month==1){
                System.out.println("31 days"); }
            else if (month==2){
                System.out.println("28 days"); }
            else if (month==3){
                System.out.println("31 days"); }
            else if (month==4){
                System.out.println("30 days"); }
            else if (month==5){
                System.out.println("31 days"); }
            else if (month==6){
                System.out.println("30 days"); }
            else if (month==7){
                System.out.println("31 days"); }
            else if (month%2==0){
                System.out.println("31 days"); }
            else {
                System.out.println("30 days"); }

        }else{
            System.out.println("invalid entry");
        }


    }
}
