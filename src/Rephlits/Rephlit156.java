package Rephlits;

public class Rephlit156 {
    public static void main(String[] args) {
        String somearray [] = {"a","foo","bar","foo","bla"};
    int a=count_appearance(somearray,"foo");
        System.out.println(a);
    }


    public static int  count_appearance(String[] arr, String t) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==t){
                count++;
            }
        }
        return count;
    }
}
