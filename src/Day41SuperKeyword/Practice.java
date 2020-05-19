package Day41SuperKeyword;


class parent{

    public parent(int a){
        System.out.println("A");
    }
    public parent(double b){
        System.out.println("C");
    }


}




public class Practice extends parent{
    /*
    public Practice(){
        super( ) ;      }
     */
    public Practice(){
        super(60);
        System.out.println("B");
    }




    public static void main(String[] args) {


        Practice obj = new Practice();
    }


}
