package Rephlits;

public class Pizza {

    String size;
    int cheesetoppings;
    int pepperonitoppings;
    int hamtoppings;

    public Pizza(String size,int cheesetoppings,int pepperonitoppings,int hamtoppings){

        this.cheesetoppings=cheesetoppings;
        this.hamtoppings=hamtoppings;
        this.pepperonitoppings=pepperonitoppings;
        this.size=size;
    }

    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return size;
    }
    public void setCheesetoppings(int cheesetoppings){
        this.cheesetoppings=cheesetoppings;
    }
    public int getCheesetoppings(){
        return cheesetoppings;
    }
    public void setPepperonitoppings(int pepperonitoppings){
        this.pepperonitoppings=pepperonitoppings;
    }
    public int getPepperonitoppings(){
        return pepperonitoppings;
    }
    public void setHamtoppings(int hamtoppings){
        this.hamtoppings=hamtoppings;
    }
    public int getHamtoppings() {
        return hamtoppings;
    }
    public double calcCost(){
        double amount=0;
        if (size.equals("small")){
            amount+=10;
        }
        else if (size.equals("medium")){
            amount+=12;
        }
        else if (size.equals("large")){
            amount+=14;
        }
        return amount+=pepperonitoppings*2+cheesetoppings*2+hamtoppings*2;
    }
    public String getDescription(){
        return getSize()+" Pizza with "+getCheesetoppings()+" Cheese toppings, "+getPepperonitoppings()+" Pepperoni toppings, and "+hamtoppings+" Ham toppings."+"\nTotal Price: "+calcCost();
    }

}

