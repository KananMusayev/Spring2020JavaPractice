package Day45Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Try_CatchBlocks {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Test started");
        try {
            System.out.println(list.get(10));

        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Test completed");




    }
}
