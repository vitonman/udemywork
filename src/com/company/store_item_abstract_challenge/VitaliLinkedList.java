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
        //while currentItem is NOT null cycle
        while(currentItem != null){
            //check if element is not null

            int comparison = (currentItem.compareTo(newItem));
            //compare element and check if string is different.

            if(comparison <0){
                //newItem is greater, move right if possible.

                if(currentItem.next() != null) {
                    // nextLink is NOT empty, we return a reference of this object
                    // to currentItem. and this becomes to point to go next
                    currentItem = currentItem.next();
                } else {
                    //if nextLink is EMPTY
                    //we put setNext to currentItem object a reference of new Item.
                    currentItem.setNext(newItem);
                    //here we set to newItem a reference of currentItem.
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

                } else {

                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;

                }

                return true;

            } else {

                //equal
                System.out.println(newItem.getValue() + " is already present.");

                return false;

            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){

            System.out.println("This list is empty");

        }

        ListItem currentItem = this.root;
        while (currentItem != null){

            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {

                if (currentItem == this.root) {

                    this.root = currentItem.next();

                } else {

                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }

        }

        return false;

    }

    @Override
    public void traverse(ListItem root) {


        if(root == null){

            System.out.println("This list is empty");

        } else {

            while(root != null){


                System.out.println(root.getValue());

                root = root.next();

            }

        }




    }
}
