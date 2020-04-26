package Rephlits;

public class Rephlit159 {
    public static void main(String[] args) {

    }

    /*
    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
     */
    public static String c_profis(int buyPrice,int sellPrice){
        String result="";
        if (buyPrice<sellPrice){
            result="profit"; }
        else if (buyPrice>sellPrice){
            result="loss"; }
        else if (buyPrice==sellPrice){
            result="no loss";
        }
        return result;

    }
}
