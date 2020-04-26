package Day16DoWhileLoops;

public class WarmUp2 {
    public static void main(String[] args) {

        /*
        how many times is the cybertek occured
         */
        String words="Cybertek is school, Cybertek is great, I love Cybertek";

        int count = 0;
        for (int i = 0; i<words.length()-7;i++){
            if (words.substring(i,i+8).equals("Cybertek")){
                count+=1;
            }
        }
        System.out.println(count);

    }
}
