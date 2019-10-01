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
            System.out.println((i+1) + ". " + contactsList.get(i));
        }
    }


}
