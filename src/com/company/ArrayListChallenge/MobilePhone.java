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
        for(Contacts contact: contactsList){

            System.out.println("Name: " + contact.getName() + "; Number: " + contact.getNumber());

        }
    }

    public int findItem(String name) {

        for(Contacts contact: contactsList){
            if(contact.getName().equals(name)){
                return contactsList.indexOf(contact);
            }
        }
        return -1;

    }


    public void removeContactItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeContactItem(position);
        }
    }

    private void removeContactItem(int position) {
        contactsList.remove(position);
    }

    public void modifyContactItem(String currentName, String newItem, int number) {
        int position = findItem(currentName);
        if(position >= 0) {
            modifyContactItem(position, newItem, number);
        }

    }



    private void modifyContactItem(int position, String newName, int newNumber) {
        Contacts newContact = new Contacts(newName, newNumber);

        contactsList.set(position, newContact);
        System.out.println("Contact item " + (position+1) + " has been modified.");
    }








}
