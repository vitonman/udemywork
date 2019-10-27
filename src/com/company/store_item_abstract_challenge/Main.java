package com.company.store_item_abstract_challenge;

public class Main {


    public static void main(String[] args) {



        VitaliLinkedList list = new VitaliLinkedList(null);

        list.traverse(list.getRoot());

        String stringData = "5 7 2 3 1 7 8";

        String[] data = stringData.split(" ");
        for(String s : data){

            list.addItem(new Node(s));

        }

        list.traverse(list.getRoot());


    }
}
