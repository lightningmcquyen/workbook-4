package com.pluralsight.hotel;

public class Main {
    public static void main(String[] args) {
        // Create a guest
        Guest guest1 = new Guest("Quyen Vong", "704-555-1234");
        System.out.println(guest1); // Print guest information

        // Create a room
        Room room1 = new Room(1, 139.00); // King room
        System.out.println("Room price: $" + room1.getPrice());

        // Create a reservation
        Reservation reservation1 = new Reservation(guest1, room1, 3, true);
        System.out.println("Total reservation price: $" + reservation1.getPrice());

        // Create an employee
        Employee employee1 = new Employee(1, "Alfred Pennyworth", "Front Desk", 25, 45);
        System.out.println(employee1); // Print employee information
        System.out.println("Total pay: $" + employee1.getTotalPay());
    }
}