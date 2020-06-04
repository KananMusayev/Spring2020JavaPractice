package Examples;

public class abcd {
    public static void main(String[] args) {


            String a="aaaaabbbbcdes";

            String result="";
            for (int i=0;i<a.length();i++){
                int count=0;
                for (int z=0;z<a.length();z++){
                    if (a.substring(i,i+1).equals(a.substring(z,z+1))){
                        count++;
                    }
                }
                if (count>1){
                    result+=a.substring(i,i+1);
                }
            }
            String mainresult="";

            for (int i=0;i<result.length();i++){
                if (!mainresult.contains(result.substring(i,i+1))){
                    mainresult+=result.substring(i,i+1);
                }
            }
        System.out.println(mainresult);





    }
}
