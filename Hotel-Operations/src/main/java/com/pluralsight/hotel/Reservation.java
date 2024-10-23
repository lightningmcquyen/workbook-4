package com.pluralsight.hotel;

public class Reservation {
    private final Guest guest;       // Guest associated with the reservation
    private final Room room;         // Room being reserved
    private int numberOfNights;      // Number of nights for the stay
    private boolean isWeekend;        // Status if the stay includes a weekend

    // Constructor to initialize Reservation
    public Reservation(Guest guest, Room room, int numberOfNights, boolean isWeekend) {
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // Getter for room type
    public String getRoomType() {
        return room.getNumberOfBeds() == 1 ? "king" : "double"; // Simple room type logic
    }

    // Setters and Getters
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend; // Return weekend status
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend; // Set weekend status
    }

    // Calculate total price
    public double getPrice() {
        double basePrice = room.getPrice();
        if (isWeekend) {
            basePrice *= 1.1; // Increase price by 10% if it's a weekend
        }
        return basePrice * numberOfNights; // Total price for the stay
    }
}