package Day27ArrayList;

import Day18Array.Array;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
    public static void main(String[] args) {
        ArrayList<String > Javengers =new ArrayList<>();
        Javengers.add("Jena");
        Javengers.add("Mary");
        Javengers.add("Tarah");
        Javengers.add("Mehriban");

        Javengers.set(1,"Alisa");
        System.out.println(Javengers);

        Javengers.remove(0);
        Javengers.add(0,"Hastpust");
        System.out.println(Javengers);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(3);
        System.out.println(numbers);

    }
}
