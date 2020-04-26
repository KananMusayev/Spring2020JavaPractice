package Day24Method_Overloading;

public class OptionalTask {
    public static void main(String[] args) {
        String  names[]={"jfhdlfh","hdwdwe","wdjwedwehd"};
        String maximum=longestword(names);
        //or you can just write    -->     System.out.println(longestword(names));
        System.out.println(maximum);
    }




    public static String longestword(String [] abc){
        String  longestword="";
        int max=0;
        for (int i=0;i<abc.length;i++){
            if (abc[i].length()>max){
                longestword=abc[i];
            }
        }
        return longestword;


    }
}
