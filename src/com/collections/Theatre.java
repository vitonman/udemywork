package com.collections;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            }else if(seat1.getPrice() > seat2.getPrice()){
                return 1;
            }else{
                return 0;
            }
        }
    };


    public Theatre(String theatreName, int numRow, int seatsPerRow) {
        this.theatreName = theatreName;


        int lastRow = 'A' + (numRow-1); //65 + (8-1)
        for(char row = 'A'; row <= lastRow; row++){ // while row <= lastrow, lastrow = 72.
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;

                if((row < '0') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;
                }else if((row > 'F') || (seatNum<4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){

        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }
    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            }else{
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " canceled.");
                return true;
            }else{
                return false;
            }
        }

        public double getPrice() {
            return price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
