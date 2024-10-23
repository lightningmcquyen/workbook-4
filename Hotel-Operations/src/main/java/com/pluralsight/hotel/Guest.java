package com.pluralsight.hotel;

public class Guest {
    private String name;          // Name of the guest
    private String contactNumber; // Contact number of the guest

    // Constructor to initialize Guest with name and contact number
    public Guest(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Getter for the guest's name
    public String getName() {
        return name;
    }

    // Getter for the guest's contact number
    public String getContactNumber() {
        return contactNumber;
    }

    // String representation of the Guest object
    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}