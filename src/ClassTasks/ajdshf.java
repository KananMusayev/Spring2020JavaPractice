package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ajdshf {


    public static void main(String[] args) {



        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));


        list.removeAll(Arrays.asList(0));
        System.out.println(list);
    }
}
