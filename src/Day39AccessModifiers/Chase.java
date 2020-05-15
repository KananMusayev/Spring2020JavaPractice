package Day39AccessModifiers;

import Day34Class_ObjectContinue.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;

public class Chase {

    public static void main(String[] args) {


        bankaccount Kenan = new bankaccount();
        Kenan.setAccountholder("Kenan Musayev");
        Kenan.setAccountnumber(45743563);
        Kenan.deposit(2000);
        Kenan.withdraw(2500);
        Kenan.withdraw(500);
        Kenan.deposit(500);
        bankaccount Esmira = new bankaccount();
        Esmira.setAccountnumber(32534635);
        Esmira.setAccountholder("Esmira Musayeva");
        Esmira.getInfo();

        Esmira.deposit(10000);
        Esmira.withdraw(10500);
        Esmira.deposit(1000);

        bankaccount[] accounts={Esmira,Kenan};
        ArrayList<bankaccount> accounts1=new ArrayList<>(Arrays.asList(Kenan,Esmira));
        for (int i=0;i<accounts1.size();i++){
            accounts1.get(i).getInfo();

        }


    }
}
