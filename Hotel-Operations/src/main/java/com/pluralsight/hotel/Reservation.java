package com.pluralsight.hotel;

public class Reservation {
    final private Guest guest;
    final private Room room;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor
    public Reservation(Guest guest, Room room, int numberOfNights, boolean isWeekend) {
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        room.checkIn(); // Automatically check in when reserved
    }

    // Getting the room type
    public String getRoomType() {
        return room.getRoomType();
    }

    // Type of room
    public void setRoomType(String roomType) {
        room.setRoomType(roomType);
    }

    // Pricing
    public double getPrice() {
        double pricePerNight = room.getPrice();
        double totalPrice = pricePerNight * numberOfNights;

        // Increase price by 10% if the stay is over the weekend
        if (isWeekend) {
            totalPrice *= 1.10;
        }
        return totalPrice;
    }

    // Getting the duration of stay
    public int getNumberOfNights() {
        return numberOfNights;
    }

    // Duration of stay set
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // It is the weekend
    public boolean isWeekend() {
        return isWeekend;
    }

    // Setting up for it to be the weekend
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Method for total price
    public double getReservationTotal() {
        return getPrice();
    }

    // Method to cancel the reservation
    public void cancel() {
        room.checkOut(); // Automatically check out when canceled
        System.out.println("Reservation canceled for " + guest.name()); // Use the getter
    }
}