package Day28ArrayListContinue;

import java.util.ArrayList;

public class Warmup2 {
    public static void main(String[] args) {
        ArrayList<Integer> c=new ArrayList<>();
        c.add(4);
        c.add(5);c.add(46);c.add(23);c.add(1);c.add(57);c.add(64);
        System.out.println(maxfromArraylist(c));
        System.out.println(minfromArraylist(c));
    }

    public static int maxfromArraylist(ArrayList<Integer> a){
        int max=Integer.MIN_VALUE;
        for (int each:a){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static int minfromArraylist(ArrayList<Integer> a){
        int min=Integer.MAX_VALUE;
        for (int each:a){
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}
