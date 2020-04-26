package Day22Methods;

public class VoidMethod {
    public static void main(String[] args) {
        myFirstMethod();
        even1To100();
    }
    public static void even1To100(){
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                continue; }
            System.out.print(i+" "); }



    }
    public static void myFirstMethod() {

        //  public static void main (String[]){}   Methods must be declared with in the class
        System.out.println("Hello World");
        System.out.println("Hello Cybertek");
        System.out.println("Hello Alisa");


    }

  //access modifier  specifier     returntype    Method name
        //public       static        void          main


        //return type is either a void or ny other data type
        //return type: if it is void method does not return any value




}
