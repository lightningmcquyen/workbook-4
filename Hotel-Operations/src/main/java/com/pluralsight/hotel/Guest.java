package com.pluralsight.hotel;

import java.util.Objects;

public final class Guest {
    private final String name;
    private final String contactNumber;

    public Guest(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String name() {
        return name;
    }

    public String contactNumber() {
        return contactNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Guest) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.contactNumber, that.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contactNumber);
    }

    @Override
    public String toString() {
        return "Guest[" +
                "name=" + name + ", " +
                "contactNumber=" + contactNumber + ']';
    }

}