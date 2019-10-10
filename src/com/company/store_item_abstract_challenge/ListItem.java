package com.company.store_item_abstract_challenge;

import java.util.LinkedList;
import java.util.List;

public abstract class ListItem {

    private ListItem left;
    private ListItem right;

    public ListItem(ListItem left, ListItem right) {
        this.left = left;
        this.right = right;
    }

    public ListItem getLeft() {
        return left;
    }

    public void setLeft(ListItem left) {
        this.left = left;
    }

    public ListItem getRight() {
        return right;
    }

    public void setRight(ListItem right) {
        this.right = right;
    }

    public void moveToLeft(ListItem value){

        setLeft(value);

    }
    public void moveToRight(ListItem value){

        setRight(value);

    }


    public int compareTo(ListItem value){

        return 0;

    }

}
