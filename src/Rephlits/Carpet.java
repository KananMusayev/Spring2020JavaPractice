package Rephlits;

public class Carpet {

    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;


    public Carpet(){

        width=300;
        length=300;
        totalPrice=200;
        isPersian=false;
        unitPrice=0;

    }
    public Carpet(double width,double length,double unitPrice,boolean isPersian){

        this.unitPrice=unitPrice;
        this.width=width;
        this.length=length;
        this.isPersian=isPersian;
        totalPrice=(width+length)*unitPrice;
        if (isPersian==true){
            totalPrice+=200;
        }

    }





}
