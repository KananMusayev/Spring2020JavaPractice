package Leetcode;

public class StringAbsent {


    public boolean checkRecord(String s) {
/*
You are given a string representing an attendance record for a student.
 The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record is not
more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be
rewarded according to his attendance record.
 //PPALLL
 */
        boolean result=false;

        int count=0;
        boolean continiousLL=true;
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals("A")){
                count++;
            }

        }

       if (s.contains("LLL")){
           continiousLL=false;
       }
        if (count<=1||continiousLL){
            result=true;
        }
        return result;

        // if (s.substring(i,i+2).equals("LL")){
        //                continiousLL=true;
        //            }
    }
}
