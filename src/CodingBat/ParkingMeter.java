package CodingBat;

public class ParkingMeter {

    int timeLeft=0,maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }

    public boolean add(int addedtime){
        boolean result=false;
        if (addedtime==25&&!(timeLeft>maxTime)){
            timeLeft+=30;
            result=true;
        }
        return result;


    }

    public void tick(){
        if (timeLeft>0) {
            timeLeft--;
        }
    }
    public boolean isExpired(){
        boolean result=false;
        if (timeLeft==0){
            result=true;
        }
        return result;
    }
}
