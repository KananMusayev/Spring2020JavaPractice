package ClassTasks;

public class task1 {




    public static String method(String a){

        String a2="";
        String a3="";
        for (int i =0;i<a.length();i++){
            if (!a2.contains(a.substring(i,i+1))){
                a2+=a.substring(i,i+1);
            }
        }

        for (int i=0;i<a2.length();i++){
            int count=0;
            for (int k=0;k<a.length();k++){
                if (a2.substring(i,i+1).equals(a.substring(k,k+1))){
                    count++;
                }
            }

            a3+=a2.substring(i,i+1)+count;
        }
            return a3;

    }



    public static void main(String[] args) {

        System.out.println(method("AAABBCDD"));



        //Write a return method that can find the frequency of characters
        //
        //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     String a="AAABBCDD";
     
     String a2="";
     String a3="";
     for (int i =0;i<a.length();i++){
         if (!a2.contains(a.substring(i,i+1))){
             a2+=a.substring(i,i+1);
         }
     }

     for (int i=0;i<a2.length();i++){
         int count=0;
         for (int k=0;k<a.length();k++){
             if (a2.substring(i,i+1).equals(a.substring(k,k+1))){
                 count++;
             }
         }
         a3+=a2.substring(i,i+1)+count;
     }
        System.out.println("a3 = " + a3);




    }
}
