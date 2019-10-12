package com.company.store_item_abstract_challenge;

public class VitaliLinkedList implements NodeList {

    //vizivajem ListItem interface.
    private ListItem root = null;

    public VitaliLinkedList(ListItem root) {

        //soedenjajem this.root s interface.
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){

            //if root is empty, add a new element there.

            this.root = newItem;
            return true;

        }

        //if root is not empty.

        ListItem currentItem = this.root;
        //here we take an element of this.root.


        while(currentItem != null){
            //check if element is not null

            //compare
            int comparison = (currentItem.compareTo(newItem));
            //compare element and check if string is different.

            if(comparison <0){
                //if number of string char is less than 0.

                if(currentItem.next() != null) {

                    currentItem = currentItem.next();

                } else {

                    //no next there, insert at end of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;

                }

            } else if(comparison > 0){

                //newItem is less
                if(currentItem.previous() != null){

                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                }

            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
