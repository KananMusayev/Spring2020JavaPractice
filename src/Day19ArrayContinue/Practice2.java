package Day19ArrayContinue;

public class Practice2 {
    public static void main(String[] args) {
        char[][]ch2D={   {'A','B','G'}  ,    {'C','D','E','F'}      };

        //print each element one by one

        System.out.println(ch2D.length);
        for (int i=0;i<ch2D.length;i++){
            for (int j=0;j<ch2D[i].length;j++){
            System.out.print(ch2D[i][j]+" ");
        }
    }}
}
