package Examples;

import java.util.Scanner;

public class noneed2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
         */
//banan
        System.out.println("enter the word");
        String word = input.nextLine();

        int a =(word.length());
        if (a%2==0){
            System.out.println(word.substring(a/2-1,a/2+1)); }
        else if (a%2!=0){
            System.out.println(word.substring(a/2-1,a/2));
        }

    }
}
