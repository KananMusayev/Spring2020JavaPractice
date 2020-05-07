package Day34Class_ObjectContinue;

public class Carpet {
        double width;
        double length;
        double unitprice;
        boolean isPersian;



        public void customOrder(double Width,double Length,double Unitprice,boolean Ispersian){

            width=Width;
            length=Length;
            unitprice=Unitprice;
            isPersian=Ispersian;
        }
        public double calccost(){
        double totalprice=(width+length)*unitprice;
        if (isPersian){
            totalprice+=200;
        }
        return totalprice;

        }

        public String toString(){
            String result="Width is: "+width+
                        " length is: "+length+
                            " unit price is : "+unitprice+
                                " and the carpet is persian "+isPersian +
                                      " total price is: "+calccost();
            return result;
        }
}
