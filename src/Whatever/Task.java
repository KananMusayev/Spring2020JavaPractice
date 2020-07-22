package Whatever;

public class Task {


    public static void main(String[] args) {



        /*
        String str= "ofdosoroq"
         */
        String str= "ofdosoroq";
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.substring(i,i+1).equals("o")){
                count++;
            }
        }
        System.out.println(count);
        if (count==3||count==4){
            str=str.replaceAll("o","a");
        }
        System.out.println(str);

    }
}
