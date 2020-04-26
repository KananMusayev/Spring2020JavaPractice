package Day27ArrayList;

import Day18Array.Array;

import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {


    ArrayList<String> hastpust = new ArrayList<>();

    ArrayList<String > shoppingList = new ArrayList<>();
          shoppingList.add("apple");
          shoppingList.add("orange");
          shoppingList.add("grape");
        System.out.println(shoppingList);
        shoppingList.add(0,"strawberry");
        System.out.println(shoppingList);
        //shoppingList.add(5,"tomato");
        //System.out.println(shoppingList); will give u error bcs u dont have index4 inde arraylist
        shoppingList.add(4,"tomato");
        System.out.println(shoppingList);

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(0,5);
        numbers.add(1,10);
        numbers.add(2,15);
        numbers.add(1,1);
        System.out.println(numbers);


        ArrayList<String > names=new ArrayList<>();
        names.add("Alisa");
        names.add("Kenan");
        names.add("Senan");
        names.add("Esmira");
        names.add("Mishi");
        for (int i=0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
        }
        System.out.println();
        for (String each:names){
            System.out.print(each+" ");
        }

        System.out.println();
        ArrayList<String > students = new ArrayList<>();
            students.add("Holly");
            students.add("Erhan");
            students.add("Tural");
            students.add("Cihan");
            students.add("Hamida");
        System.out.println(students);
            students.clear();
        System.out.println(students);

        ArrayList<String > adlar = new ArrayList<>();
        adlar.add("Ferhat");
        adlar.add("Lexi");
        adlar.add("Asiya");
        adlar.add("Ozgen");
        adlar.add("Alex");
        adlar.add("Safwan");
        adlar.set(2,"Shawkrat");
        System.out.println(adlar);


        ArrayList<String> goodGuys=new ArrayList();
        goodGuys.add("Hakan");
        goodGuys.add("Ihsan");
        goodGuys.add("Tim");
        goodGuys.add("Ibrohim");
        goodGuys.add("Dilyar");

        boolean a=goodGuys.contains("tim");
        System.out.println(a);


        ArrayList<String> badGuys=new ArrayList();
        badGuys.add("Muhtar");
        badGuys.add("Asiya");
        badGuys.add("rephlit");

        boolean a1=badGuys.equals(goodGuys);//false
        System.out.println(a1);

//Remove (int) removes that index number

        ArrayList<Integer> lists=new ArrayList<>();
                    lists.add( 1 );
                    lists.add( 2 );
                    lists.add( 3 );
                    lists.add( 4 );
                    lists.add( 5 );

        lists.remove(1);
        lists.remove(2);
        lists.remove(1);

        System.out.println(lists);

        //remove(Integer) :removes the first matching object and returns a boolean expression


        ArrayList<Integer> lists2=new ArrayList<>();
        lists2.add( 1 );
        lists2.add( 2 );
        lists2.add( 3 );
        lists2.add( 4 );
        lists2.add( 5 );


        Integer A=1;
       boolean r1=lists2.remove(A);//if it has 1 and if it removed it then it prints true
        System.out.println(lists2);
        System.out.println(r1);




        ArrayList<String> city =new ArrayList<>();
        city.add("Miami");
        city.add("Miami");
        city.add("Azerbaijan");
        city.add("Gotham");
        city.add("Istanbul");
        city.add("Urumqi");

       // city.remove("Miami");

        if (city.remove("Miami")){
            city.remove(2);
        }
        System.out.println(city);

        ArrayList<Integer> price =new ArrayList<>();
        price.add(1);
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);


        price.remove(Integer.parseInt("2"));//parse method gets u int primitive
        System.out.println(price);
        price.remove(Integer.valueOf("3"));
        boolean a2=price.remove(Integer.valueOf("3"));
        System.out.println(a2);
        System.out.println(price);






























    }}
