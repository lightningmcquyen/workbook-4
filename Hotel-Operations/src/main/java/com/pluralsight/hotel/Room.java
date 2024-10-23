package com.pluralsight.hotel;

public class Room {
    private String roomType; // "king" or "double"
    final private int numberOfBeds;
    private boolean isOccupied;
    private boolean isDirty;

    // Constructor
    public Room(int roomNumber, String roomType, int numberOfBeds, boolean isDirty) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.isOccupied = false;
        this.isDirty = isDirty;
    }

    // Bed capacity
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Room type price
    public double getPrice() {
        double price;
        if ("king".equalsIgnoreCase(roomType)) {
            price = 139.00;
        } else {
            price = 124.00;
        }
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Checking-in method
    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true; // Mark as dirty after check-in
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    // Checking-out method
    public void checkOut() {
        isOccupied = false;
        isDirty = true; // Mark as dirty after check-out
    }

    // Cleaning method
    public void cleanRoom() {
        isDirty = false; // Clean the room
    }
}