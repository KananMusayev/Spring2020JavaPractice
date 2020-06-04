package Day45Exception;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {
//chrome,firefox,opera...
    public static void main(String[] args) {
    NoSuchElementException obj=new NoSuchElementException();
    //throw obj;
       //throw  new NoSuchElementException();

       // System.out.println();
   /* boolean breatkTime=true;
    if (breatkTime){
        throw new RuntimeException("Its break time");
    }

    */
   try {

       throw new IOException();
   }catch (Exception e){

   }

   int arr[]={5,6,7};
        System.out.println(arr[100]);
        System.out.println(9/0);

        throw new RuntimeException(); //You can not write anything after the thrown exception
        //System.out.println("");

    }
}
