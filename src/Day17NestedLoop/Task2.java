package Day17NestedLoop;

public class Task2 {
    public static void main(String[] args) {
        //now try do it with while loop
        int z=5;
        while (z>0){
        int i =0;
        String result ="";
        while (i<5){
            result+="*";

            i++; }
        System.out.println(result);
        z--;
    }
    }
}
