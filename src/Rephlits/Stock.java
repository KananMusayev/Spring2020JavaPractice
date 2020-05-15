package Rephlits;

public class Stock {



    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock( String tickerSymbol,String companyName,int price, int totalShares){

        this.totalShares=totalShares;
        this.price=price;
        this.companyName=companyName;
        this.tickerSymbol=tickerSymbol.toUpperCase();
    }

    public long marketCap(){
        return totalShares*price;
    }

    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }
    public String toString(){
        return "Ticker Symbol: "+tickerSymbol+
                "\nCompany: "+companyName+
                "\nCurrent Price: $"+price+"("+percentChange+")"+
                "\nMarket Cap: $"+marketCap();
    }

}
