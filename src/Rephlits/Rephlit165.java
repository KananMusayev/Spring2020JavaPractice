package Rephlits;

public class Rephlit165 {
    public static void main(String[] args) {

        System.out.println(getThunderBlazz(true,false,1,2,3));
    }
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3){

        boolean getornot=false;
        if (available==true||gift==true){
            getornot=true;
        }
        else if (ingredient1==1&&ingredient2==2&&ingredient3==3){
            getornot=true;
        }
        else if (ingredient1==3&&ingredient2==1&&ingredient3==2){
            getornot=true;
        }
        return getornot;

    }
}
