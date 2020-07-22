package ClassTasks;

import java.util.Arrays;

public class Concating_2Arrayswith_1Loop {

    public static void main(String[] args) {


      int a[]={1,2,3,4};
      int b[]={5,6};
      int k[]=new int[a.length+b.length];
       int z=0;
      for (int i=0;i<k.length;i++){
          if (i<a.length){
        k[i]=a[i];}
          else {
              k[i]=b[z];
              z++;
          }

      }


        System.out.println(Arrays.toString(k));




    }
}
