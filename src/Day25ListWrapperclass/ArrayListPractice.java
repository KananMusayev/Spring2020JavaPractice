package Day25ListWrapperclass;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("Alisa");
        System.out.println(nameList);
        nameList.add("Esmira");
        nameList.add("Kenan");
        System.out.println(nameList);

        //create an arraylist cslled studentnames
        //create scanner object called scan
        Scanner scan =new Scanner(System.in);
        ArrayList<String > studentNames =new ArrayList<>();
        while (true) {
            System.out.println("Enter a name");
            String name = scan.nextLine();
            studentNames.add(name);
            System.out.println("Do you want to add another name?");
            String answer = scan.nextLine().toLowerCase();
            if (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid");
                break; }
            if (answer.equals("no")){
                break; }
        }


        System.out.println(studentNames);

    }
}
