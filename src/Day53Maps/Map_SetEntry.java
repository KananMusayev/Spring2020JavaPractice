package Day53Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_SetEntry {
    public static void main(String[] args) {

        LinkedHashMap<String ,String > countries=new LinkedHashMap<>();
        countries.put("Azerbaijan","Baku");
        countries.put("Tajikistan","Dushanba");
        countries.put("Russia","Moscow");
        countries.put("Turkey","Ankara");
        countries.put("USA","Washington");
        String input="azerbaijan";
        for (Map.Entry<String ,String > each: countries.entrySet()){
            //System.out.println("Country name: "+each.getKey()+" and its capital is, "+each.getValue());

            String country=each.getKey();
            String city=each.getValue();
            if (input.equalsIgnoreCase(country)){
                System.out.println(city);
            }
        }









    }
}
