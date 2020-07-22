package Day53Maps;

import java.util.*;

public class Map_SetEntries {


    public static void main(String[] args) {
        LinkedHashMap<String ,String > fb=new LinkedHashMap<>();

        fb.put("Tester01","password1");
        fb.put("Tester02","password1");
        fb.put("Tester02","password2");
        fb.put("Tester03","password3");
        fb.put("Tester04","password4");
        fb.put("Tester05","password5");

        System.out.println(fb);


        System.out.println("============================");


        //keySet(); returns you keys as a Set
        for (String eachkey : fb.keySet()){
            System.out.println(eachkey+" "+fb.get(eachkey));
        }

        List<String >usernames=new ArrayList<>(fb.keySet());

        System.out.println(usernames);

        System.out.println("============================");

        //values();
        //returns u all the values
        for (String eachkey: fb.values()){
            System.out.println(eachkey);
        }

        List<String > passwords=new ArrayList<>(fb.values());
        System.out.println(passwords);


        System.out.println("============================");




        /*
        create a map that contains of student names(String) and scores(Integer)
        put 5 students and their scores
        write a program that can print out the names of the students who made less than 90 as a score
         */


        Map<String ,Integer> classmate=new LinkedHashMap<>();

        classmate.put("Ali",86);
        classmate.put("Ahmet",92);
        classmate.put("Kenan",75);
        classmate.put("Esmira",96);
        classmate.put("Junior",65);

        Map<String ,Integer> badStudents=new LinkedHashMap<>();
        Map<String ,Integer> goodStudents=new LinkedHashMap<>();




        for (String eachKey: classmate.keySet()){

            int eachscore=classmate.get(eachKey);
            if (eachscore<90){
                badStudents.put(eachKey,eachscore);
                System.out.println(eachKey);
            }
            else {
                goodStudents.put(eachKey,eachscore);
            }
            System.out.println(badStudents);
            System.out.println(goodStudents);



        }




    }
}
