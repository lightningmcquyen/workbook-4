package com.pluralsight.hotel;

/**
 * @param name          Name of the guest
 * @param contactNumber Contact number of the guest
 */
public record Guest(String name, String contactNumber) {
    // Constructor to initialize Guest with name and contact number

    // toString method for easy representation
    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}