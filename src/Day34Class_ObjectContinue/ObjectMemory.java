package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    public static void main(String[] args) {
        ArrayList<Integer>list1 =new ArrayList<>(Arrays.asList(10,20,30,40));
        //Objects yeni sagdaki new Arraylist olan heap memoryde yerleshir amd
        //list yazilan soldaki ise stack memoryde
        //butun methodlar ,local variable lar hamsi stackdadi

        /*
        new Arraylist objecti ashagida list2=list1 line indan sonra iki variable
        ile reference olunub ve hip memoryde yerleshir ve eyni obyekti bolushurler
        nece defe new keywordu istifade edirsense o qederde yenisi yaradilir
         */

        ArrayList<Integer>list2=list1;

        list1.remove(2);
        System.out.println(list1);//10,20,40
        System.out.println(list2);

        System.out.println("========================");

        String str1=new String("cybertek");
        String str2=str1;
        str1.toUpperCase();
        /*
        deyishmiyecek hec neyi cunki string immutable di ve bunu bele
        immutable oldugunu ispat etmek olar

         */
        System.out.println(str1);
        System.out.println(str2);



        /*
       Asagidaki halda ise 2 eded object yaradilib biri line 46 ve digeri line 45
         */


        String str3=new String("azeri");
        String str4=str3;
        str3=str3.toUpperCase();
        System.out.println(str3);
        System.out.println(str4);



    }
}
