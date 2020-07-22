package ClassTasks;

import java.util.ArrayList;

public class JavaEnke {

    public static void main(String[] args) {
        int a[]={3,5,7,3,5,8,9,10,34,6,3,5,4,2,8,7};
        ArrayList<Integer>list=new ArrayList<>();
        int max=a[a.length-1];
        for (int i=a.length-1;i>=0;i--){
            if (a[i]>max){
                max=a[i];
                list.add(i);
            }
        }
        ArrayList<Integer>list2=new ArrayList<>();

        for (int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        list2.add(a.length-1);
        System.out.println(list2);






    }
}
