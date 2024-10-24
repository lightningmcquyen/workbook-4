package com.pluralsight.dealership;

import java.util.ArrayList;

// Instance variables
public class Dealership {
    private String name;
    private String address;
    private String phone;

    //Constructor to create dealership objects
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        // Instantiating a "new" ArrayList
        this.inventory = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Methods
    public Vehicle getVehiclesByPrice(double min, double max){
        return null;
    }

    public Vehicle getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public Vehicle getVehiclesByYear(int min, int max){
        return null;
    }

    public Vehicle getVehiclesByColor(String color){
        return null;
    }

    public Vehicle getVehiclesByMileage(double min, double max){
        return null;
    }

    public Vehicle getVehiclesByType(String vehicleType){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }
}