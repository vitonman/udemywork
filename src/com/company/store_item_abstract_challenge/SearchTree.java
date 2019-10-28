package com.company.store_item_abstract_challenge;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if(this.root == null){
            this.root = newItem;
            return true;
        }

        //if not, start comparing from the head of the tree
        ListItem currentItem = this.root;

        while (currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //newItem is greather, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    //there is no node to right, add at this point.
                    currentItem.setNext(newItem);
                    return true;
                }

            } else if(comparison > 0){
                //newItem is less, move to ,eft is possible
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                } else {
                    //there is no node on left so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already in present");
                return false;
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
        //recursive method
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
