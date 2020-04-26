package Day18Array;

    public class ArrayClass {
        public static void main(String[] args) {
            /*
            Array Decleration:
            DataType[] variableName={Value1,Value2...}
            DataType variableName[]={Value1,Value2...}
             */

            int[] arr={10,20,30,};
            int arr2[]={10,20,30};
            char[] abc={'a','b','c'};
            String [] abd={"Ali","Ahmed","Chinar"};
            System.out.println(abd[1]);
            String name = abd[2];
            System.out.println(name);
            //initialize the size of array without values
            //int[] arr=new int[size]
            int[] Mynumbers=new int[5];
            for (int i=0;i<Mynumbers.length;i++){
                System.out.println(Mynumbers[i]); }
            //default values:
            //int,byte,short,long==>0
            //double&&float==>0.0
            //boolean==>false
            //char==>" "   empty space
            //String==>null
            int ch[]=new int[3];
            ch[2]=5;
            ch[1]=4;
            ch[0]=3;
            //ch =new int[4];
            for (int i=0;i<ch.length;i++){
                System.out.print(ch[i]+" ");
            }
            //if u add ch=new ch[4] after line 32 it will be new array with nothing in it
            //previous values are gone as well
            //will give u 4 default values bcs its brand new variable and hasnt been initialized




    }
}
