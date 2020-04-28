package Day25ListWrapperclass;

import java.util.ArrayList;

public class Warmup4 {
    public static void main(String[] args) {


        /*
        write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
:star-struck:
4
:the_horns::skin-tone-2:
2
         */
        String arr1[] = {"A", "B", "C"};
        String arr2[] = {"D", "E", "F", "G"};
        ArrayList<String> a= new ArrayList<>();
        int k=0;
        for (int i=0;i<arr2.length+arr1.length;i++){
            if (i<arr1.length){
                a.add(arr1[i]);
            }
            else if (i>=arr1.length){
                a.add(arr2[k]);
                k++; } }
        System.out.println(a);



    }
}
