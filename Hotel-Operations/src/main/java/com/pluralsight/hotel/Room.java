package com.pluralsight.hotel;

public class Room {
    private final int numberOfBeds;  // Number of beds in the room
    private final double price;       // Price per night for the room
    private boolean occupied;         // Status if the room is occupied
    private boolean dirty;            // Status if the room is dirty

    // Constructor to initialize Room attributes
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false; // Initially, the room is not occupied
        this.dirty = false;    // Initially, the room is clean
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;  // Return number of beds
    }

    public double getPrice() {
        return price;         // Return price per night
    }

    public boolean isOccupied() {
        return occupied;      // Return occupancy status
    }

    public boolean isDirty() {
        return dirty;        // Return cleanliness status
    }

    // Method to check if the room is available
    public boolean isAvailable() {
        return !occupied && !dirty; // Available if not occupied and not dirty
    }

    // Methods to change occupancy and cleanliness
    public void checkIn() {
        occupied = true;      // Mark room as occupied
    }

    public void checkOut() {
        occupied = false;     // Mark room as not occupied
    }

    public void clean() {
        dirty = false;        // Mark room as clean
    }

    public void dirty() {
        dirty = true;         // Mark room as dirty
    }
}