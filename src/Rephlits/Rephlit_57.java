package Rephlits;

public class Rephlit_57 {
    public static void main(String[] args) {
        System.out.println(surroundStr("abcabcabc","abc"));
    }

     public static String surroundStr(String s,String  search_term) {
            String a="("+search_term+")";
                                            String empty="";

            for (int i=0;i<s.length()-search_term.length()+1;i+=search_term.length()){
                         if (s.substring(i,i+1).equals(search_term)){
                             empty+=a;
                         }else {
                             empty+=s.substring(i,i+1);
                         }

            }
            return empty;



        }

    }

