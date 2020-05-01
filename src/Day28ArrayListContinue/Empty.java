package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Empty {
    public static void main(String[] args) {

        ArrayList<Integer> deliveries = new ArrayList<Integer>(Arrays.asList(100,200,10));
        int max_fuel=10;
        int refueltimes = 0;
        int maxfuelatbeginning=max_fuel;

        //3,3,1,2,6   ,3 ==>5
        //7,7,7       ,7==>3
        //9,1         ,3==>4
        //100,200,10  ,10==>31
        for (int i=0;i<deliveries.size();i++){
            if (deliveries.get(i)>=max_fuel&&max_fuel==maxfuelatbeginning){
                refueltimes+=deliveries.get(i)/max_fuel; }
            else if (deliveries.get(i)<=max_fuel){ //times=3;maxfuel=2
                if (max_fuel==deliveries.get(i)){
                    max_fuel=maxfuelatbeginning;
                    continue; }
                refueltimes++;
                max_fuel=max_fuel-deliveries.get(i);
                if (max_fuel==0){
                    max_fuel=maxfuelatbeginning; }
            }

            }
        System.out.println(refueltimes);




                }




}
