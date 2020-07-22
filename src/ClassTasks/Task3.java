package ClassTasks;

public class Task3 {

public static String method(String a){
    String result="";

    for (int i=0;i<a.length();i++){
        if (!result.contains(a.substring(i,i+1))){
            result+=a.substring(i,i+1);
        }
    }
    return result;
}
    public static void main(String[] args) {

        System.out.println(method("AAABBBCCC"));
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
String a="AAABBBCCC";
String result="";

    for (int i=0;i<a.length();i++){
        if (!result.contains(a.substring(i,i+1))){
            result+=a.substring(i,i+1);
        }
    }
        System.out.println(result);


    }
}
