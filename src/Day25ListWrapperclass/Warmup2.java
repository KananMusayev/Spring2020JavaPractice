package Day25ListWrapperclass;

public class Warmup2 {
    public static void main(String[] args) {
        String DTX = unique("AABBCDEEE");
        System.out.println(DTX);
    }

    /*
    Write a return method that accepts String
    and returns the unique values from the String
    Ex:
    Unique("AABBCDEEE")==>"CD"
     */

    public static String unique(String str) {
        String empty = "";
        for (int k = 0; k < str.length(); k++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(str.substring(k, k + 1))) {
                    count++;
                }
            }
            if (count == 1) {
                empty += str.substring(k, k + 1);
            }

        }
        return empty;
    }
}
