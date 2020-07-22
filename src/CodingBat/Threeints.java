package CodingBat;

public class Threeints {

    public static void main(String[] args) {
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean result = false;

        if (equalOk == true) {
            if (a <= b|| b <= c) {
                result = true;
            }
        }
        if (a < b && b < c) {
            result = true;
        }

        return result;

    }
}
