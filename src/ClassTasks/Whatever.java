package ClassTasks;

import Day30LocatTimeFormatting.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Whatever {
    public static void main(String[] args) {

        int aa[]={1,2,3};
        int gg[]={4,5,6,7};
        int hh[]={8,9};
        int dd[]={10,11};
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        int [] result=new int[aa.length+gg.length+hh.length+dd.length];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i=0;i<result.length;i++){
            if (a<i){
              result[i]=gg[b];
              if (b<i){
                  result[i]=hh[c];
                  if (d<i){
                      result[i]=dd[d]; } } }
            result[i]=aa[a];
            a++;


        }
        System.out.println(Arrays.toString(result));





    }
}
