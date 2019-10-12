package com.company.store_item_abstract_challenge;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    //Etot object ja mogu postavit kak next, previous and compare, na osnove interface ListItem.


    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return (((String) super.getValue()).compareTo((String) item.getValue()));
            // method *compareTo* jevljajeca naslednikom String class, dlja sravnenija stroki.
            //etot method vozvrashajet chislo na skolko razlichajutca stroki.
        } else {
            return -1;
        }
    }
}
