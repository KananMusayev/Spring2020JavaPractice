package ClassTasks;

public class Armstrong_Number {


    public static void main(String[] args) {

    int a=371;
    String b=a+"";
    int count=0;
    boolean result=false;
    for (int i=0;i<b.length();i++){
        count+=Integer.parseInt(b.substring(i,i+1))*Integer.parseInt(b.substring(i,i+1))*Integer.parseInt(b.substring(i,i+1));
    }
    if (count==a){
        result=true;
    }
        System.out.println(result);






    }
}
