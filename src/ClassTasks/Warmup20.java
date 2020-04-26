package ClassTasks;

public class Warmup20 {
    public static void main(String[] args) {

        /*
        print out nums from 1-30;
        if num is divisible by 3 print
        "FIN" instead of that
        if num is divisible by 5 print
        "RA" instead of that
        if num is divisible by 3 and 5 print
        "FINRA" instead of that

         */
        int num=1;
        String str ="";
        while (num<=30){
            if (num%3==0&&num%5==0){
                str+=" FINRA "; }
            else if (num%3==0){
                str+=" FIN "; }
            else if (num%5==0){
                str+=" RA "; }
            else str+=num+" ";

            num++; }
        System.out.println(str);

    }
}
