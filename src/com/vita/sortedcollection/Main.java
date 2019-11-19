package com.vita.sortedcollection;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 3);
        stockList.addStock(temp);

        temp = new StockItem("chair", 12.00, 12);
        stockList.addStock(temp);

        temp = new StockItem("cup", 1.00, 7);
        stockList.addStock(temp);

        temp = new StockItem("cup", 1.10, 50);
        stockList.addStock(temp);

        temp = new StockItem("door", 40.00, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 5.10, 54);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 4.10, 34);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.10, 124);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket vitabasket = new Basket("Vitali");
        sellItem(vitabasket, "car", 1);
        System.out.println(vitabasket);

        sellItem(vitabasket, "car", 1);
        System.out.println(vitabasket);

        if(sellItem(vitabasket, "car", 1) != 1){
            System.out.println("There are no more cars in stock.");
        }

        sellItem(vitabasket, "spinner", 6);
        System.out.println(vitabasket);

        sellItem(vitabasket, "juice", 2);
        sellItem(vitabasket, "cup", 14);
        sellItem(vitabasket, "bread", 1);
        System.out.println(vitabasket);

        System.out.println(stockList);

 /*       temp = new StockItem("pen", 1.12);
        stockList.Items().put(temp.getName(), temp);*/

        stockList.Items().get("car").adjustStock(2000);
        System.out.println(stockList);

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
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
