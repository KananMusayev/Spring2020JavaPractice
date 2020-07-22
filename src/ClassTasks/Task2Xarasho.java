package ClassTasks;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2Xarasho {


    public static void main(String[] args) {

        String str = "AAABBBBCC";//A3B3C2

        String middle = "";

        for (int i = 0; i < str.length(); i++) {
            if (!middle.contains(str.substring(i, i + 1))) {
                middle += str.substring(i, i + 1);
            }
        }
        System.out.println(middle);
        String result = "";
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < middle.length(); i++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (middle.substring(i, i + 1).equals(str.substring(k, k + 1))) {
                    count++;
                }
            }
            map.put(middle.substring(i, i + 1), count);
        }
        System.out.println(map);
    }










}
