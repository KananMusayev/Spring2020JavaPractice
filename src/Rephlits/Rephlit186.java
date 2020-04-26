package Rephlits;

public class Rephlit186 {
    public static void main(String[] args) {
        System.out.println(extractNum("aa2aa3"));
    }
    public static String extractNum(String s) {

        String result ="";
        for (int i=0;i<s.length();i++) {
            if (s.substring(i, i + 1).equals("1")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("2")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("3")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("4")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("5")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("6")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("7")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("8")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("9")) {
                result += s.substring(i, i + 1);
            } else if (s.substring(i, i + 1).equals("10")) {
                result += s.substring(i, i + 1);
            }
        }
            return result;

    }


    }
