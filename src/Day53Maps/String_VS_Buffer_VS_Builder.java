package Day53Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {


        String str="cybertek";
        str.concat(" School"); //"Cybertek School"
        System.out.println(str); //will give u "Cybertek" because String is immutable

        System.out.println("====================================");
        StringBuilder builder=new StringBuilder("Cybertek");
            builder.append(" School");
        System.out.println(builder);

        System.out.println("====================================");

        StringBuffer buffer=new StringBuffer("Cybertek");
        buffer.append(" School");
        System.out.println(buffer);

        buffer.reverse();//has good methods such as this
        System.out.println(buffer);





    }


}
