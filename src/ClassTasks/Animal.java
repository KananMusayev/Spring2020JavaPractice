package ClassTasks;

public class Animal {


    public static void main(String[] args) {



        String str = "AAAAABBBCCCDEFJ";

        String result="";
        for(int k=0;k<str.length();k++){
            int count=0;
            for (int i=0;i<str.length();i++){
                if(str.substring(i,i+1).equals(str.substring(k,k+1))){
                    count++;
                }
            }
            if(count==1){
                result+=str.substring(k,k+1);
            }

        }
        System.out.println(result);
    }
}






