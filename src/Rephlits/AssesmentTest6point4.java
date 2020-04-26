package Rephlits;

public class AssesmentTest6point4 {
    public static void main(String[] args) {

    }
    public static int[] do_switch(int[] i){
        int z=i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=z;
        return i;
    }

}
