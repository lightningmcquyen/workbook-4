package com.pluralsight.hotel;

public class Main {

    public static void main(String[] args) {
        // Create guests
        Guest guest1 = new Guest("Quyen", "123-456-7890");
        Guest guest2 = new Guest("Siry", "098-765-4321");

        // Create rooms
        Room room101 = new Room(101, "king", 1, false); // 1 bed, not dirty
        Room room102 = new Room(102, "double", 2, true); // 2 beds, dirty

        // Create reservations
        Reservation reservation1 = new Reservation(guest1, room101, 3, true); // 3 nights over the weekend
        System.out.println("Total reservation cost for " + guest1.name() + ": $" + reservation1.getReservationTotal());

        // Check in the guest for room 101
        room101.checkIn();
        System.out.println("Room 101 available? " + room101.isAvailable());

        // Creating a reservation for a dirty room
        Reservation reservation2 = new Reservation(guest2, room102, 2, false); // 2 nights on a weekday
        System.out.println("Total reservation cost for " + guest2.name() + ": $" + reservation2.getReservationTotal());

        // Checking in the second room
        room102.checkIn(); // (room is dirty btw)

        // Clean room 102
        room102.cleanRoom(); // room is cleaned so check availability again
        System.out.println("Room 102 cleaned. Available now? " + room102.isAvailable());

        // Check in the second guest
        room102.checkIn();
        System.out.println("Room 102 available after check-in? " + room102.isAvailable());

        // Create an employee
        Employee employee1 = new Employee(1, "Alfred Pennyworth", "Front Desk", 25.0, 44);
        System.out.println("Employee: " + employee1.name());
        System.out.println("Total pay: $" + employee1.getTotalPay());
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());

        // Canceling the first reservation
        reservation1.cancel();
        System.out.println("Room 101 available after cancellation? " + room101.isAvailable());
    }
}