package ClassTasks;

public class task19 {

    public static void main(String[] args) {
        String str = "Java Java Java";
        String target ="Java";
        int length=target.length();
        int count=0;
        for (int i=0;i<str.length()-length+1;i++){
            if (str.substring(i,i+length).equals(target)){
                count++;
            }
        }
        System.out.println(count);
    }
}
