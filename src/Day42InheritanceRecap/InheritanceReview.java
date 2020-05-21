package Day42InheritanceRecap;




class B{

    public B(int a){
        System.out.println(" int");
    }

    public B( double a){
        System.out.println(" double");

    }

    public B(long a){
        this(4.5);
        System.out.println(" long");

    }
}
public class InheritanceReview extends B{


    public InheritanceReview(String a){
        super(4l);//double long
        System.out.println("String");//string
    }


    InheritanceReview obj1=new InheritanceReview("Hello");


}
