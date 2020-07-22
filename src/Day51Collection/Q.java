package Day51Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {


    public static void main(String[] args) {


        Queue<String>queue=new PriorityQueue<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
       String q1= queue.poll();
        System.out.println(q1);
        System.out.println(queue);


    }
}
