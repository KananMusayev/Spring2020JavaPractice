package ClassTasks;

public class Taskabtloop {
    public static void main(String[] args) {
        /*
        1. write a program that can return the
        unique characters from a string
		Ex:  "AABCC" ==> "B"
         */

        String given ="AABCC";
        String result="";
        for (int i =0;i<given.length()-1;i++){
            int count=0;

            for (int k =0;k<given.length()-1;k++){
              if (given.charAt(i)==given.charAt(k)){
                  count++;
              }
          }
          if (count==1){
              System.out.println(given.charAt(i));
          }
        }
    }
}
