package ClassTasks;

public class TaskXarasho {


    public static void main(String[] args) {

        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        String longeststring=names[0];

        for (int i=0;i<names.length;i++){
            if (longeststring.length()<names[i].length()){
                longeststring=names[i];
            }
        }
        System.out.println(longeststring);



    }
}
