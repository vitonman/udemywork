package com.company.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    public void addContact(String name, int number) {

        Contacts contact = new Contacts(name, number);
        contactsList.add(contact);

    }

    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }

    public void printContactList() {
        System.out.println("You have " + contactsList.size() + " items in your contact list");
        for(int i=0; i< contactsList.size(); i++) {
            contactsList.get(i).getContactInfo();
        }
    }

    private int findItem(Contacts searchItem) {
        return contactsList.indexOf(searchItem);
    }

    public boolean onFile(Contacts searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }


/*    public void removeContact(Contacts item) {
        int position = findItem(item);
        if(position >= 0) {
            removeContact(position);
        }
    }*/





}
