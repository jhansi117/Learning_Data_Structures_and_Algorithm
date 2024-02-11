public class BuyAndsell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        int BestBuy = Integer.MAX_VALUE;
        int BestSell = Integer.MIN_VALUE;
        int MaxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            int Buy = (i==0)?prices[0]:Math.min(BestBuy,prices[i]);
            int Sell = prices[i];

            int profit = Sell-Buy;
            if(profit<0){
                MaxProfit = 0;
            }

            if(profit>MaxProfit){
                MaxProfit = profit;
            }

            if(Buy< BestBuy){
                BestBuy = Buy;
            }

            if(Sell>BestSell){
                BestSell = Sell;
            }

            
        }
        System.out.println("Buy Price = "+BestBuy);
        System.out.println("Sell Price = "+BestSell);
        System.out.println("Profit = "+MaxProfit);
    }
}
