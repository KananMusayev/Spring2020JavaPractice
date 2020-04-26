package Day16DoWhileLoops;

import java.util.Scanner;

public class Warmuptask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
write a java program that can count how many time the word
book is appeared in a string:
ex:
input : I like books, i have books, i need book.
output : 3
 */

String sentence = "I like books, I have books, i need book ";
//       index :          i,  i+4==>book
int count = 0 ;
for (int i=0; i <sentence.length()-3;i++){
    if (sentence.substring(i,i+4).equals("book")){
        count+=1;
    }
}
        System.out.println(count);

    }
}
