package Day28ArrayListContinue;

public class Constructortask {
    public Constructortask (){
        System.out.println("Hello World ");
        System.out.println("I am a default constructor");
    }
    public Constructortask (int num){
        System.out.println("alohhaaaa");
        System.out.println("her shey bomba olacag");
    }
    public static void method1(){
        Constructortask obj=new Constructortask();
    }


        public static void main(String[] args) {
        Constructortask obj=new Constructortask(9);
            method1();

            //if u give :
        // public Constructortask (String str){
        //and in main method :Constructortask obj=new Constructortask();
        //it willnt compile .Has to be same
    }
}
