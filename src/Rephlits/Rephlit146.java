package Rephlits;

import java.util.Scanner;

public class Rephlit146 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
 */

public static void person (String s){
    String [] abc= s.split(",");
    System.out.println("person name : "+abc[0]+" last name: "+abc[1]+" age: "+abc[2]);


}

}
