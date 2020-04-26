package Rephlits;

public class Rephlit_51 {
    public static void main(String[] args) {
        System.out.println(countString("crazy crayfish crushing craniums", "cra"));
        System.out.println(countString("sometimes solutions dont come on time", "me"));
    }

        public static int countString(String str,String toFind){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.contains(toFind)){
                count++;
                str=str.replaceFirst(toFind,"");
            }
        }
        return count;
    }
}
