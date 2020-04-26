package Day21Methods;

public class Task1KmToMiles {
    public static void main(String[] args) {
    KmToMiles(6);
    }

    public static void KmToMiles (double km){
        /*
         write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
         */

        double miles=0.612*km;
        System.out.println(miles);
    }
}
