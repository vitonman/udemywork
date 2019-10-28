package com.company.store_item_abstract_challenge;

public class Main {


    public static void main(String[] args) {


        SearchTree list = new SearchTree(null);

        list.traverse(list.getRoot());
//
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s : data){

            list.addItem(new Node(s));

        }

        list.traverse(list.getRoot());


    }
}
