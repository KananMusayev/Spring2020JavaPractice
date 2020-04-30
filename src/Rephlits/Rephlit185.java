package Rephlits;
import java.util.ArrayList;

public class Rephlit185 {
    public static void main(String[] args) {

    }

    public static void test(ArrayList<String> words){
//exp:[hey, how, is, yo,]
// was:[hey, is, everyone, yo]
        words.add(1,"hey");
        words.add(3,"yo");
    }

}
