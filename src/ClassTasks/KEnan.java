package ClassTasks;

import java.util.Arrays;

public class KEnan {
    public static void main(String[] args) {
        String str="Anna";
        String result="";
        boolean Mainresult=false;
        for (int i=str.length()-1;i>=0;i--){
            result+=str.substring(i,i+1);
        }
        if(result.equalsIgnoreCase(str)){
            Mainresult=true;
        }
        System.out.println(Mainresult);
    }
}
