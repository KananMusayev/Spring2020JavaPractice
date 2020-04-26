package Rephlits;

public class Rephlit164 {
    public static void main(String[] args) {
        System.out.println( simpleRoomBook(true,7,5,2018));
    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        return (isAvailable==true)?(year == 2018)?(!(month == 7 && day >= 1 && day <= 8))? true:false:false:false;

    }

    }
