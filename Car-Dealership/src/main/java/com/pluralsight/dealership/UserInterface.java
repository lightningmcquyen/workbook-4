package com.pluralsight.dealership;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public UserInterface(){
        // logic placeholder
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        for(Vehicle car : vehicles){
            System.out.println(car);
        }
    }

    private void init(){
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();
    }

    public void quit() {
        System.out.println("""
    
    
      D & B Used Cars|111 Old Benbrook Rd|817-555-5555
    
    🚗 Thank you for stopping by. Please come again! 🚚
    
    """);
    }

        public void displayMenu(){
            System.out.println("""
                    
                    🏁 Welcome to D & B Used Cars 💨
                    ================================
                    
                    (A) Display Vehicles By Price
                    (B) Display Vehicles By Make/Model
                    (C) Display Vehicles By Year
                    (D) Display Vehicles By Color
                    (E) Display Vehicles By Mileage
                    (F) Display Vehicles By Vehicle Type
                    (G) Display All Vehicles
                    (H) Add a Vehicle
                    (I) Remove a Vehicle
                    (X) Quit
                    
                    ================================
                            Enter your choice:
                    """);
    }

    public void display(){
        init();
        displayMenu();
        Scanner scanley = new Scanner(System.in);
        String option = scanley.nextLine().toUpperCase();
        switch (option){
            case "A" : processGetByPriceRequest();
                break;
            case "B" : processGetByMakeModelRequest();
                break;
            case "C" : processGetByYearRequest();
                break;
            case "D" : processGetByColorRequest();
                break;
            case "E" : processGetByMileageRequest();
                break;
            case "F" : processGetByVehicleTypeRequest();
                break;
            case "G" : processGetAllVehiclesRequest();
                break;
            case "H" : processAddVehicleRequest();
                break;
            case "I" : processRemoveVehicleRequest();
                break;
            case "X" : quit();
                break;
            default: System.out.println("\nInvalid option. Please choose a valid option.");
                display();
                break;
        }
    }

    public void processGetByPriceRequest(){
        // logic placeholder
    }

    public void processGetByMakeModelRequest(){
        // logic placeholder
    }

    public void processGetByYearRequest(){
        // logic placeholder
    }

    public void processGetByColorRequest(){
        // logic placeholder
    }

    public void processGetByMileageRequest(){
        // logic placeholder
    }

    public void processGetByVehicleTypeRequest(){
        // logic placeholder
    }

    public void processGetAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest(){
        // logic placeholder
    }

    public void processRemoveVehicleRequest(){
        // logic placeholder
    }

}
