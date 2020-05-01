package Rephlits;
import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> r=new ArrayList<>(Arrays.asList("2","6","foo bar","abc"));


        String find="foo";
        String contains="";
        String notcontains="";


        for (int i=0;i<r.size();i++){
            if (r.get(i).contains(find)){
                contains=r.get(i);
            }
            else {
                notcontains="search failed";
            }
        }
        System.out.println(contains);
    }

    public static String search(ArrayList<String> r, String find){

        String contains="";
        String notcontains="";

           for (int i=0;i<r.size();i++){
               if (r.get(i).contains(find)){
                   contains=r.get(i);
               }
               else if (!r.get(i).contains(find)){
                   notcontains="search failed";
               }
        }
           if (contains.length()==0){
               contains=notcontains;
           }
           return contains;
    }

}
