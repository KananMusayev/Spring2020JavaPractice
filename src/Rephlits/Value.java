package Rephlits;

public class Value {
    private int val = 0;
    private boolean wasModified = false;
public Value(int  value){
val=value;

    }
    public Value(){


    }

    public void setVal(int val){
    this.val=val;

    }

    public boolean wasModified(){
        boolean result =false;
        if (val!=0){
            result=true;
        }
return result;
    }

   /*
    public int getVal(){

        if (val!=0){
            return val;
        }


    }

    */
}
