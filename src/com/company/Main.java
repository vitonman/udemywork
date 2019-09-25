package com.company;

import com.company.house_challenge.Chair;
import com.company.house_challenge.House;
import com.company.house_challenge.Room;
import com.company.house_challenge.Table;


public class Main {

    public static void main(String[] args) {

        Chair chair = new Chair("MyChair", 20, 33.33);
        Table table = new Table("default_table");
        Room room = new Room(20,chair,table);

        House house = new House(room);

        house.useTable();


    }
}

