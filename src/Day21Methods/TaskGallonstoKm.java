package Day21Methods;

public class TaskGallonstoKm {
    public static void main(String[] args) {
    gallontoliter(5);
    }

    public static void gallontoliter(double gallon){
        /*
         write a method called GalonsToLitters,
         that can convert gallons to litters
	 			   1 G = 3.75 L

         */
        double liters=gallon*3.75;
        System.out.println(liters);
    }
}
