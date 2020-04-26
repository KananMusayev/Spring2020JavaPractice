package Day19ArrayContinue;

public class FindinguniquefromStringarray {
    public static void main(String[] args) {
        String arr[]={"A","A","B","C","C","D","T"};
        for (int k=0;k<arr.length;k++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
               if (arr[i].equals(arr[k])){
                   count++;
               }
            }
            if (count==1){
                System.out.println(arr[k]);
            }

        }
    }
}
