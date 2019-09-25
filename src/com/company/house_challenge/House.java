package com.company.house_challenge;

public class House {

    private Room room;

    public House(Room room) {
        this.room = room;
    }

    public void useTable(){

        room.getChair().lookAt();
        sitAt();
    }

    private void sitAt(){

        room.getTable().use();

    }

}
