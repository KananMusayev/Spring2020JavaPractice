package Examples;

public class Arrayexample2 {
    public static void main(String[] args) {
        /*combine 2 arrays*/
        int [] abc={1,2,3};
        int[] cbd={4,5,6};
        int []c =new int[abc.length+cbd.length];
        for (int i =0;i<abc.length;i++){
            c[i]=abc[i];
        }

        for (int i=0;i<cbd.length;i++){
            c[i+(c.length-3)]=cbd[i];
        }
        System.out.println(c);

        for (int i =0;i<c.length;i++){
            System.out.println(c[i]+" ");
        }

    }
}
