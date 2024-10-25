package com.pluralsight.dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    private static final String FILE_PATH = "src/main/resources/WorkshopFiles/inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        List<Vehicle> vehicles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            // Reading dealership information
            if ((line = reader.readLine()) != null) {
                String[] dealershipInfo = line.split("\\|"); // Split by '|'
                if (dealershipInfo.length == 3) {
                    String name = dealershipInfo[0];
                    String address = dealershipInfo[1];
                    String phone = dealershipInfo[2];
                    dealership.setName(name);
                    dealership.setAddress(address);
                    dealership.setPhone(phone);
                }
            }

            // Reading vehicle information
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|"); // Split by '|'
                if (parts.length == 8) { // Ensure there are 8 fields
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    vehicles.add(vehicle);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading inventory file: " + e.getMessage());
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        // logic placeholder
    }
}
