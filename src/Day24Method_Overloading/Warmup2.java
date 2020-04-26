package Day24Method_Overloading;

public class Warmup2 {
    public static void main(String[] args) {
        /*
        use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
         */
        System.out.println(uniques("ABBC"));
        ;

    }

    public static String uniques(String a) {
        String empty = "";
        for (int k = 0; k < a.length(); k++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == a.charAt(k)) {
                    count++;
                }
            }
            if (count == 1) {
                empty += a.charAt(k);
            }
        }
        return empty;
    }
}
