package Rephlits;

public class ParkingMeter {

    int timeLeft=0,maxTime;



    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }

    public boolean add(int value){
        boolean result=false;
        if ((value+timeLeft)<=maxTime){
        if (value==25){
            timeLeft+=30;
            result=true;
        }}
        return result;

    }
    public void tick(){
        if (timeLeft>0){
        timeLeft--;}
    }

    public boolean isExpired   (){
        boolean result=false;
        if (timeLeft==0){
            result=true;
        }
        return result;
    }



}
