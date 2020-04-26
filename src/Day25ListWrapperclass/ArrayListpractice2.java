package Day25ListWrapperclass;
import java.util.ArrayList;

public class ArrayListpractice2 {
    public static void main(String[] args) {

          ArrayList<Integer> list=new ArrayList<>();

          //add all the even nums between 0-40;

        for (int i=0;i<=30;i++){
            if (i%2==0){
            list.add(i);}
        }
        System.out.println(list);
        System.out.println(list.size());
        for (Integer each:list){
            System.out.print(each+" ");


        }
        System.out.println();

        for (int i=0;i<=30;i++){
            if (i%2!=0){
                continue;
            }else{
            list.add(i);
        }}
        System.out.println(list);

        ArrayList<Integer> abc=new ArrayList<>();

        abc.add(7);
        abc.add(8);
        abc.add(9);
        abc.add(3);
        abc.add(2);
        int num=abc.get(3);//Unboxing, there is no primitives in ArrayList

        System.out.println(num);
        abc.clear();
        System.out.println(abc);











    }
}
