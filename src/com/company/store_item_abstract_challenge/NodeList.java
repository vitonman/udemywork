package com.company.store_item_abstract_challenge;

public interface NodeList {

    //interface classes, kotorije vizivajutca uzhe v osnovnom class.
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
