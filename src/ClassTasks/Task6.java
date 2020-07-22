package ClassTasks;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string

 */
String a="sgs656fg9";
int sum=0;
char b[]=a.toCharArray();
for (int i=0;i<b.length;i++){
    if (Character.isDigit(b[i])){
        sum+=Integer.parseInt(b[i]+"");
    }
}
        System.out.println(sum);





    }
}
