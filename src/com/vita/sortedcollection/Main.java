package com.vita.sortedcollection;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 56);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.20, 78);
        stockList.addStock(temp);

        System.out.println(stockList);

    /*    for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }
*/

        Basket vitabasket = new Basket("Vitali");
        System.out.println("==========");
        vitabasket.addToBasket(stockList.get("bread"), 30);
        System.out.println("==========");
        System.out.println(vitabasket);


/*        if(sellItem(vitabasket, "car", 1) != 1){
            System.out.println("There are no more cars in stock.");
        }*/

// IMPORTANT SELLING.
        sellItem(vitabasket, "juice", 10);
        System.out.println(vitabasket);
        System.out.println(stockList);


     /*   stockList.Items().get("juice").adjustStock(2000);
        System.out.println(stockList);*/

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " cost " + price.getValue());
        }
    }


    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);

        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0){

            //need to reserve item.

            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int reserveItem(Basket basket, String item, int quantity){



        return 0;

    }

}
