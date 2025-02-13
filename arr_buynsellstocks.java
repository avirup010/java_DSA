// import java.util.*;
// public class arr_buynsellstocks {

//     public static int buyAndSellStock(int prices[]){
//     int buyPrice = Integer.MAX_VALUE;
//     int maxProfit=0;

//     for(int i =0;i<prices.length;i++){
//        if(buyPrice<prices[i]){
//         int profit = prices[i]-buyPrice;
//         System.out.println(profit);
//         maxProfit= Math.max(maxProfit, profit);
//        }else{
//         buyPrice=prices[i];
//        }
// }

//     return maxProfit;
//     }
// public static void main(String[] args) {
//     int prices[]= {7,1,5,3,6,4};
//     System.out.println(buyAndSellStock(prices));
// }    
// }

import java.util.*;
public class arr_buynsellstocks {

    public static int stok(int price[]){
        int buypri = Integer.MAX_VALUE;
        int maxp =0;
        for(int i =0;i<price.length;i++){
            if(buypri<price[i]){
            int profit = price[i]-buypri;
            maxp = Math.max(maxp, profit);
            }
            else{
                buypri= price[i];
            }
        }
        return maxp;
        }
        public static void main(String[] args) {
            int price[]={7,1,5,3,6,4};
            System.out.println(stok(price));
        }
        
    }

