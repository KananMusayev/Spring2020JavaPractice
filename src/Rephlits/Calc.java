package Rephlits;



public class Calc {

    private int x;
    private int y;
    private int result;


    int getResult(){
        return result;
    }
    void setY(int y){
        this.y=y;

    }
    void setX(int x){
        this.x=x;
    }
    void plus(){
        result=x+y;
    }
    void minus(){
        result=x-y;
    }
}
