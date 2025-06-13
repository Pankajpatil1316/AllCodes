package com.Problems;

public class MaximumProfitOfStock {
    public static void main(String[] args) {
        int[] prices = {2,2,43,32,46,7,7,2,2002,5,8,3,2,4,8,78};

        int minPrice = Integer.MAX_VALUE, maxProfit =0;

        for(int price : prices){

            if(price<minPrice){
                minPrice=price;
            }else {
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }

        System.out.println(maxProfit);

    }
}
