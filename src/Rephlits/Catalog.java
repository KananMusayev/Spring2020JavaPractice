package Rephlits;
import java.util.ArrayList;
public class Catalog {

    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

/*
    public void loadItems() {
        //TODO


        items.add("iPhone 6s");
        items.add("iPhone 6s Plus");
		items.add("iPhone X");
		items.add("MacbookPro");
		items.add("ThumbDrive") ;
		items.add("Beats HeadPhones");
		items.add("Mouse");
		items.add("Charger");
		items.add("iPad");
		items.add("Dyson Vacuum");
		items.add("TV");
		items.add("Apple Watch");

    }

    public void loadPrices() {
        //TODO
        prices.add(449.0);
        prices.add(549.0);
        prices.add(1149.0);
        prices.add(1499.0);
        prices.add(39.99);
        prices.add(349.99);
        prices.add(79.99);
        prices.add(39.99);
        prices.add(429.0);
        prices.add(399.0);
        prices.add(2199.0);
        prices.add(559.0);
    }


    public void loadMonthlyPayments() {
        //TODO
        monthlyPayments.add(18.71);
        monthlyPayments.add(22.88);
        monthlyPayments.add(56.16);
        monthlyPayments.add(79.49);
        monthlyPayments.add(2.68);
        monthlyPayments.add(15.12);
        monthlyPayments.add(8.98);
        monthlyPayments.add(4.56);
        monthlyPayments.add(18.31);
        monthlyPayments.add(16.25);
        monthlyPayments.add(89.49);
        monthlyPayments.add(21.18);

    }


    public void loadWholeCatalog() {
        //TODO
        loadItems();
        loadPrices();
        loadMonthlyPayments();
    }

    public StringBuilder getWholeCatalog() {
        loadWholeCatalog();
        StringBuilder str = new StringBuilder();
        for (int i=0; i<items.size(); i++) {
            str.append(items.get(i)+"-"+prices.get(i)+ "-" +monthlyPayments.get(i)+"\n");
        }
        return str;
    }




    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST:
           loadWholeCatalog();
        //TODO:
            if (items.contains(item)){
                int num=0;
                for (int i=0;i<items.size();i++){
                    if (items.get(i).equals(item)){
                         num=i;
                    }
                }
                return item+"-"+prices.get(num)+"-"+prices.get(num);
            }else {

        return null;}
    }



    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //LOAD WHOLE CATALOG HERE FIRST
            loadWholeCatalog();
        //TODO
        ArrayList<String > list=new ArrayList<>();
        boolean a=false;
for (int i=0;i<monthlyPayments.size();i++){
    if (monthlyPayments.get(i)<=price){
        list.add(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i));
        a=true;
    }
    if (a=true){
        return list; }
    else {


        return null;}
    }

    public void updatePrice(String item,double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
            loadWholeCatalog();
        //TODO
           for (int i=0;i<prices.size();i++){
               if (items.get(i).equals(item)){
                   prices.set(i,newPrice/12);
               }
           }

    }

    /**
     * Method looks for an item in the catalog and removes
     * all details for that item including item name, price, monthlypayments
     *
     *
     * @param item
     */
/*


    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
            int k=items.size();
            int num=0;
            for (int i=0;i<items.size();i++){
                items.removeIf(p->p.equals(item));

            }
    }
 */
}
