package InteviewquestionsPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        /*
        Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */        String a="aaabbbccddtteeesasdsff";


        String result="";
        for (int i=0;i<a.length();i++){
            if (!result.contains(a.charAt(i)+"")){
                result+=a.charAt(i);
            }
        }
        System.out.println(result);
        String empty="";
        for (int k=0;k<result.length();k++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i)==(a.charAt(k))){
                        count++;
                    }
            }
            empty+=result.charAt(k)+""+count;
        }
        System.out.println(empty);


    }
}
