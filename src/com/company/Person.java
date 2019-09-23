package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName(){

        return firstName;

    }

    public String getLastName(){

        return lastName;

    }

    public int getAge(){

        return age;

    }

    public void setFirstName(String name){

        firstName = name;

    }
    public void setLastName(String lastname){

        lastName = lastname;

    }

    public void setAge(int agevalue){

        if(agevalue < 0 || agevalue > 100){

            age = 0;

        } else {

            age = agevalue;

        }

    }

    public boolean isTeen(){

        if(getAge() > 12 && getAge() < 20){

            return true;

        } else {

            return false;
        }

    }

    public String getFullName(){

        if(getFirstName().isEmpty() && getLastName().isEmpty()){

            return "";

        } else if(getLastName().isEmpty()){

            return getFirstName();

        } else if(getFirstName().isEmpty()){

            return getLastName();

        }


        return getFirstName() + " " + getLastName();

    }



}
