package CodingBat;

public class whatever {

    public static void main(String[] args) {


        String a = "AAABBBCCCDEF";

        String result = "";
        for (int k = 0; k < a.length(); k++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i, i + 1).equals(a.substring(k, k + 1))) {
                    count++;
                }
            }
            if (count == 1) {
                result += a.substring(k, k + 1);
            }
        }
        System.out.println(result);

    }

}
