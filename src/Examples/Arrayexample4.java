package Examples;

public class Arrayexample4 {
    public static void main(String[] args) {
        //on a given string find out which one is the longest word
        //do it with array
        String[] a={"akjfhdslfdjsl","khdsfbkdsfkhssddaf","dfwdf","bdfkhdskfdshkdsbhdbkdsbgdsbkdsbg","ksdhfghds"};

        String longestname=""   ;
        int max=0;
        for (int i=0;i<a.length;i++){
            if (a[i].length()>max){
                max=a[i].length();
                longestname=a[i];
            }
        }

        System.out.println(longestname);


    }
}
